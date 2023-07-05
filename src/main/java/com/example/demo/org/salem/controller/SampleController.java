package com.example.demo.org.salem.controller;

import com.example.demo.org.salem.domain.KakaoPayApprovalVO;
import com.example.demo.org.salem.service.KakaoPay;
import lombok.Setter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Log
public class SampleController {

    @Autowired
    private KakaoPay kakaopay;




    @GetMapping("/kakaoPay")
    public void kakaoPayGet() {

    }

    @PostMapping("/kakaoPay")
    public String kakaoPay() {
        log.info("kakaoPay post............................................");
        kakaopay.kakaoPayReady();
        return "redirect:" + kakaopay.kakaoPayReady();

    }






    @GetMapping("/kakaoPaySuccess")
    public ModelAndView kakaoPaySuccess(
                                        @RequestParam("pg_token") String pg_token,
                                        @RequestParam(value = "pod", required = false) String pod,
                                        @RequestParam(value = "pud", required = false) String pud) {


        KakaoPayApprovalVO approvalVO = kakaopay.kakaoPayInfo(pg_token, pod, pud);

        ModelAndView mav = new ModelAndView("kakaoPaySuccess");
        mav.addObject("info", approvalVO);
        return mav;
    }
}
