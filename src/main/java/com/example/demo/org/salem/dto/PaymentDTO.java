/*
package com.example.demo.org.salem.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter @Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
@Builder
public class PaymentDTO {

    @Id
    private String tid;

    private String pod;

    private String pud;

    private String amount;


}*/
package com.example.demo.org.salem.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="`payment`")
@Builder
public class PaymentDTO {
    @Id
    private String tid;
    private String pod;
    private String pud;
    private String amount;
}