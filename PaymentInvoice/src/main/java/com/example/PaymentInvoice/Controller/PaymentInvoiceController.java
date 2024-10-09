package com.example.PaymentInvoice.Controller;

import com.example.PaymentInvoice.Model.Customer;
import com.example.PaymentInvoice.Model.Invoice;
import com.example.PaymentInvoice.Model.Vendor;
import com.example.PaymentInvoice.Repository.VendorRepo;
import com.example.PaymentInvoice.Service.PaymentInvoiceService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoice")
public class PaymentInvoiceController {

    @Autowired
    private PaymentInvoiceService paymentInvoiceService;

    @PostMapping("/add-customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
    {
        return ResponseEntity.status(201).body(paymentInvoiceService.addCustomer(customer));
    }

    @PostMapping("/add-vendor")
    public ResponseEntity<Vendor> addVendor(@RequestBody Vendor vendor)
    {
        return ResponseEntity.status(201).body(paymentInvoiceService.addVendor(vendor));
    }

    @GetMapping("/invoice/{Cid}/{Vid}")
    public ResponseEntity<Invoice> getInvoice(@PathVariable("Cid") String Cid, @PathVariable("Vid") String Vid)
    {
        return ResponseEntity.status(200).body(paymentInvoiceService.createInvoice(Cid, Vid));
    }
}
