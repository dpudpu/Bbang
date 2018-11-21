package com.jmt.bbang.service;

import com.jmt.bbang.domain.Member;
import com.jmt.bbang.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Member getMember(String email){
        return memberRepository.getMember(email);
    }

}
