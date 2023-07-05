package com.example.demo.org.salem.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
@table()
@Builder
public class PaymentDTO {
    private String tid;
    private String pod;
    private String pud;
}
