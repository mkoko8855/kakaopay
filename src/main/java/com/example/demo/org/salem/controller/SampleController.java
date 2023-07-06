/*
package com.example.demo.org.salem.controller;

import com.example.demo.org.salem.domain.KakaoPayApprovalVO;
import com.example.demo.org.salem.dto.PaymentRepository;
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

    @Autowired
    private PaymentRepository paymentRepository;






    @GetMapping("/kakaoPay")
    public void kakaoPayGet() {
    }

    @PostMapping("/kakaoPay")
    public String kakaoPay() {
        log.info("kakaoPay post............................................");
        return "redirect:" + kakaopay.kakaoPayReady();
    }

    @GetMapping("/kakaoPaySuccess")
    public ResponseEntity<?> kakaoPaySuccess(
            @RequestParam(value = "pg_token") String pg_token) {
        KakaoPayApprovalVO approvalVO = kakaopay.kakaoPayInfo(pg_token);


        return ResponseEntity.ok().body(approvalVO);
    }
}*/

package com.example.demo.org.salem.controller;

import com.example.demo.org.salem.domain.KakaoPayApprovalVO;
import com.example.demo.org.salem.dto.PaymentRepository;
import com.example.demo.org.salem.service.KakaoPay;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class SampleController {

    @Autowired
    private KakaoPay kakaopay;

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/kakaoPay")
    public String kakaoPay(@RequestParam("pod") String pod,
                           @RequestParam("pud") String pud,
                           @RequestParam("itemName") String itemName,
                           @RequestParam("quantity") String quantity,
                           @RequestParam("totalAmount") String totalAmount,
                           @RequestParam("approvalUrl") String approvalUrl,
                           @RequestParam("cancelUrl") String cancelUrl,
                           @RequestParam("failUrl") String failUrl) {
        log.info("kakaoPay post............................................");
        return "redirect:" + kakaopay.kakaoPayReady(pod, pud, itemName, quantity, totalAmount, approvalUrl, cancelUrl, failUrl);
    }

    @GetMapping("/kakaoPaySuccess")
    public ResponseEntity<?> kakaoPaySuccess(@RequestParam("pg_token") String pg_token) {
        KakaoPayApprovalVO approvalVO = kakaopay.kakaoPayInfo(pg_token);
        return ResponseEntity.ok().body(approvalVO);
    }
}
