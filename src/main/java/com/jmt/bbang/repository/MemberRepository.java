package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmailAndPassword(String Email, String Password);
}
