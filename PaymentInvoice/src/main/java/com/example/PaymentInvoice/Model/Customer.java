package com.example.PaymentInvoice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Customer")
public class Customer {
    @Id
    private String CId;
    private String Cname;
    private String Caddress;
    private String Cphone;
    private String Cserviceid;
    private String Cvendorid;
    private int Cquantity;
    private String Cbankname;
    private String CIFSC;
    private String Caccountno;
    private String Cbbranch;
}
