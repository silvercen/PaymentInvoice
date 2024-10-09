package com.example.PaymentInvoice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Vendor")
public class Vendor {
    @Id
    private String Vid;
    private String Vname;
    private String Vaddress;
    private String Vphone;
    private List<Services> services;
}
