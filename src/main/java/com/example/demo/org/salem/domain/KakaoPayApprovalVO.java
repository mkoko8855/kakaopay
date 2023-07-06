/*
package com.example.demo.org.salem.domain;

//KakaoPayApprovalVO: 카카오페이 결제 승인 성공 후 반환되는 데이터를 나타내는 클래스입니다.
import lombok.Data;

import java.util.Date;

@Data
public class KakaoPayApprovalVO {

    private String aid, tid, cid, sid;
    private String partner_order_id, partner_user_id, payment_method_type;
    private AmountVO amount;
    private CardVO card_info;
    private String item_name, item_code, payload;
    private Integer quantity, tax_free_amount, vat_amount;
    private Date created_at, approved_at;

}*/
package com.example.demo.org.salem.domain;

import lombok.Data;

import java.util.Date;

@Data
public class KakaoPayApprovalVO {
    private String aid;
    private String tid;
    private String cid;
    private String sid;
    private String partner_order_id;
    private String partner_user_id;
    private String payment_method_type;
    private AmountVO amount;
    private CardVO card_info;
    private String item_name;
    private String item_code;
    private String payload;
    private Integer quantity;
    private Integer tax_free_amount;
    private Integer vat_amount;
    private Date created_at;
    private Date approved_at;
}