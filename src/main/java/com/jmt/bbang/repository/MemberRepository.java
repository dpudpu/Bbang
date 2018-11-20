package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmailAndPassword(String Email, String Password);

    @Query("SELECT m FROM Member m JOIN FETCH m.roles WHERE m.email = :email")
    Member getMember(@Param("email") String email);
}
