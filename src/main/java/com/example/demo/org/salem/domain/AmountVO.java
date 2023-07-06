/*
package com.example.demo.org.salem.domain;
//AmountVO: 결제 금액 정보를 나타내는 클래스입니다.
public class AmountVO {
    private Integer total, tax_free_amount, vat_amount, point, discount;


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }



}*/
package com.example.demo.org.salem.domain;

import lombok.Data;

@Data
public class AmountVO {
    private Integer total;
    private Integer tax_free_amount;
    private Integer vat_amount;
    private Integer point;
    private Integer discount;
}