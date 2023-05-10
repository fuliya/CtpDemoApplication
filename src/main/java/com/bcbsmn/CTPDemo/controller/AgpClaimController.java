package com.bcbsmn.CTPDemo.controller;

import com.bcbsmn.CTPDemo.ResponseHandler.JsonResponseHandler;
import com.bcbsmn.CTPDemo.repository.agp.AGPBenefitPlanRepository;
import com.bcbsmn.CTPDemo.repository.agp.AGPClaimHeaderRepository;
import com.bcbsmn.CTPDemo.repository.agp.AGPMemberRepository;
import com.bcbsmn.CTPDemo.repository.agp.AGPProviderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/agpData")
public class AgpClaimController {

    private AGPClaimHeaderRepository claimHeaderRepository;
    private AGPMemberRepository memberRepository;
    private AGPProviderRepository providerRepository;
    private AGPBenefitPlanRepository benefitPlanRepository;

    public AgpClaimController(AGPClaimHeaderRepository claimHeaderRepository, AGPMemberRepository memberRepository, AGPProviderRepository providerRepository, AGPBenefitPlanRepository benefitPlanRepository) {
        this.claimHeaderRepository = claimHeaderRepository;
        this.memberRepository = memberRepository;
        this.providerRepository = providerRepository;
        this.benefitPlanRepository = benefitPlanRepository;
    }
    @GetMapping("/getClaimByClaimID/{claimID}")
    @ResponseBody
    public ResponseEntity<Object> getClaimHeader(@PathVariable long claimID){
        return JsonResponseHandler.responseBuilder("claimHeader", claimHeaderRepository.findById(claimID));
    }

    @GetMapping("/getMemberByMemberID/{memberID}")
    @ResponseBody
    public ResponseEntity<Object> getMember(@PathVariable long memberID){
        return JsonResponseHandler.responseBuilder("member", memberRepository.findById(memberID));
    }

    @GetMapping("/getProviderByProviderID/{providerID}")
    @ResponseBody
    public ResponseEntity<Object>  getProvider(@PathVariable long providerID){
        return JsonResponseHandler.responseBuilder("provider", providerRepository.findById(providerID));
    }

    @GetMapping("/getBenefitByBenefitID/{claimID}")
    @ResponseBody
    public ResponseEntity<Object>  getBenefitByBenefitID(@PathVariable long benefitPlanID){
        return JsonResponseHandler.responseBuilder("Benefit Plan", benefitPlanRepository.findById(benefitPlanID));
    }
}
