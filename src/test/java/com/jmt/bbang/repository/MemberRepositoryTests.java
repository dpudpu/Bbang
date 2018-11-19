package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class MemberRepositoryTests {
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 로그인체크(){
        Member member = memberRepository.findByEmailAndPassword("dpudpu@naver.com","1234");
        System.out.println(member.getId()+"/"+member.getName());

        member.setName("배대주ㅜㅜㅜㅜㄴ");
        System.out.println(member.getName());
    }
}
