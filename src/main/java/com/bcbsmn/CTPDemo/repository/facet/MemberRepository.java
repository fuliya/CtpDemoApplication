package com.bcbsmn.CTPDemo.repository.facet;


import com.bcbsmn.CTPDemo.model.facet.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
