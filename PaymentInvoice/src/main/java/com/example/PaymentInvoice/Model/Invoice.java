package com.example.PaymentInvoice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Invoice")
public class Invoice {
    @Id
    private String Iid;
    private String CId;
    private String Cname;
    private String Caddress;
    private String Cphone;
    private String Cbankname;
    private String CIFSC;
    private String Caccountno;
    private String Cbbranch;
    private int Cquantity;
    private String Vid;
    private String Vname;
    private String Vaddress;
    private String Vphone;
    private String Sid;
    private String Sname;
    private double Samount;
}
