package com.bcbsmn.CTPDemo.dao;

import com.bcbsmn.CTPDemo.model.facet.Member;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface MemberDAO {
    Optional findOneMember (long memberID);

    List<Member> findAllMember ();
}
