package com.example.PaymentInvoice.Service;

import com.example.PaymentInvoice.Model.Customer;
import com.example.PaymentInvoice.Model.Invoice;
import com.example.PaymentInvoice.Model.Services;
import com.example.PaymentInvoice.Model.Vendor;
import com.example.PaymentInvoice.Repository.CustomerRepo;
import com.example.PaymentInvoice.Repository.InvoiceRepo;
import com.example.PaymentInvoice.Repository.VendorRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PaymentInvoiceService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private VendorRepo vendorRepo;

    @Autowired
    private InvoiceRepo invoiceRepo;

    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public Vendor addVendor(Vendor vendor) {
        return vendorRepo.save(vendor);
    }

    public Invoice createInvoice(String Cid, String Vid) {
        Customer customer = customerRepo.findById(Cid).orElse(null);
        Vendor vendor = vendorRepo.findById("V001").orElse(null);
        Invoice invoice = new Invoice();

        if (customer != null && vendor!=null) {
            BeanUtils.copyProperties(customer, invoice);
            BeanUtils.copyProperties(vendor, invoice);
            Services service = vendor.getServices().stream().filter(serv -> serv.getSid().equals(customer.getCserviceid()))
                    .findFirst().get();
            BeanUtils.copyProperties(service, invoice);
            return invoiceRepo.save(invoice);
        } else {
            invoice.setIid(customer.getCvendorid());
            return invoice;
        }
    }
}
