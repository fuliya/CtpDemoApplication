package com.bcbsmn.CTPDemo.repository.agp;


import com.bcbsmn.CTPDemo.model.agp.AGPMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AGPMemberRepository extends JpaRepository<AGPMember, Long> {
}
