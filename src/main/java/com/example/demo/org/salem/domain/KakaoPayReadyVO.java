/*
package com.example.demo.org.salem.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class KakaoPayReadyVO {

    //response
    private String tid, next_redirect_pc_url;
    private Date created_at;

}*/
package com.example.demo.org.salem.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class KakaoPayReadyVO {
    private String tid;
    private String next_redirect_pc_url;
    private Date created_at;
}