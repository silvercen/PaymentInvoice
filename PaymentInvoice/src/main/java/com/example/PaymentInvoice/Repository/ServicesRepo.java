package com.example.PaymentInvoice.Repository;

import com.example.PaymentInvoice.Model.Services;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepo extends MongoRepository<Services, String> {
}
