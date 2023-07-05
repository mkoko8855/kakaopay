package com.example.demo.org.salem.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class PaymentDTO {
    private String tid;
    private String pod;
    private String pud;
}
