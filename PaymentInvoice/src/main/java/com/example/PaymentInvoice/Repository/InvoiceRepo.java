package com.example.PaymentInvoice.Repository;

import com.example.PaymentInvoice.Model.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepo extends MongoRepository<Invoice, String> {
}
