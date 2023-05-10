package com.bcbsmn.CTPDemo.dao.impl;


import com.bcbsmn.CTPDemo.dao.MemberDAO;
import com.bcbsmn.CTPDemo.model.facet.Member;
import com.bcbsmn.CTPDemo.repository.facet.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberDAOImpl implements MemberDAO {

    @Autowired
    private MemberRepository memberRepository;
    @Override
    public Optional findOneMember(long memberID) {
        return memberRepository.findById(memberID);
    }

    @Override
    public List<Member> findAllMember() {
        return (List<Member>) memberRepository.findAll();
    }
}
