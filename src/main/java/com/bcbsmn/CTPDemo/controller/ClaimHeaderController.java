package com.bcbsmn.CTPDemo.controller;

import com.bcbsmn.CTPDemo.ResponseHandler.JsonResponseHandler;
import com.bcbsmn.CTPDemo.dao.BenefitPlanDAO;
import com.bcbsmn.CTPDemo.dao.ClaimHeaderDAO;
import com.bcbsmn.CTPDemo.dao.MemberDAO;
import com.bcbsmn.CTPDemo.dao.ProviderDAO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facetData")
public class ClaimHeaderController {

    private BenefitPlanDAO benefitPlanDAO;
    private ClaimHeaderDAO claimHeaderDAO;
    private MemberDAO memberDAO;
    private ProviderDAO providerDAO;

    public ClaimHeaderController(BenefitPlanDAO benefitPlanDAO, ClaimHeaderDAO claimHeaderDAO, MemberDAO memberDAO, ProviderDAO providerDAO) {
        this.benefitPlanDAO = benefitPlanDAO;
        this.claimHeaderDAO = claimHeaderDAO;
        this.memberDAO = memberDAO;
        this.providerDAO = providerDAO;
    }

    @GetMapping("/getClaimByClaimID/{claimID}")
    @ResponseBody
    public ResponseEntity<Object> getClaimHeader(@PathVariable long claimID){
        return JsonResponseHandler.responseBuilder("claimHeader", claimHeaderDAO.findOneClaim(claimID));
    }

    @GetMapping("/getMemberByMemberID/{memberID}")
    @ResponseBody
    public ResponseEntity<Object> getMember(@PathVariable long memberID){
        return JsonResponseHandler.responseBuilder("member", memberDAO.findOneMember(memberID));
    }

    @GetMapping("/getProviderByProviderID/{providerID}")
    @ResponseBody
    public ResponseEntity<Object>  getProvider(@PathVariable long providerID){
        return JsonResponseHandler.responseBuilder("provider", providerDAO.findOneProvider(providerID));
    }

    @GetMapping("/getBenefitByBenefitID/{claimID}")
    @ResponseBody
    public ResponseEntity<Object>  getBenefitByBenefitID(@PathVariable long benefitPlanID){
        return JsonResponseHandler.responseBuilder("Benefit Plan", benefitPlanDAO.findOneBenefitPlan(benefitPlanID));
    }

}
