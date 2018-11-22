package com.jmt.bbang.Security;

import com.jmt.bbang.domain.Member;
import com.jmt.bbang.domain.Role;
import com.jmt.bbang.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class BbangUserDetailsService implements UserDetailsService {
    @Autowired
    MemberService memberService;


    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberService.getMember(email);
        if(member==null)
            throw new UsernameNotFoundException(email+" is not found");

        Collection<GrantedAuthority> authorityCollection = new ArrayList();

        for(Role role : member.getRoles())
            authorityCollection.add(new SimpleGrantedAuthority("ROLE_"+role.getName()));

        //세션에 저장된다.
        BbangUserDetails bbangUserDetails = new BbangUserDetails(email, member.getPassword(), authorityCollection);
        bbangUserDetails.setId(member.getId());
        bbangUserDetails.setName(member.getName());

        return bbangUserDetails;
    }
}
