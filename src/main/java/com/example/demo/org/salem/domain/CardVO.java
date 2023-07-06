/*
package com.example.demo.org.salem.domain;

//CardVO: 결제를 위한 카드 정보를 나타내는 클래스입니다.
import lombok.Data;

@Data
public class CardVO {

    private String purchase_corp, purchase_corp_code;
    private String issuer_corp, issuer_corp_code;
    private String bin, card_type, install_month, approved_id, card_mid;
    private String interest_free_install, card_item_code;

}*/
package com.example.demo.org.salem.domain;

import lombok.Data;

@Data
public class CardVO {
    private String purchase_corp;
    private String purchase_corp_code;
    private String issuer_corp;
    private String issuer_corp_code;
    private String bin;
    private String card_type;
    private String install_month;
    private String approved_id;
    private String card_mid;
    private String interest_free_install;
    private String card_item_code;
}