package com.example.PaymentInvoice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Services")
public class Services {
    @Id
    private String Sid;
    private String Sname;
    private double Samount;
}
