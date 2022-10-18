package com.company.Summative1CristieJBNicholas.services;


import com.company.Summative1CristieJBNicholas.repository.InvoiceRepository;
import com.company.Summative1CristieJBNicholas.models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
   private InvoiceRepository repo;

    @Autowired
    public ServiceLayer(InvoiceRepository repo) {
        this.repo = repo;
    }

    public List<Invoice> getInvoice(Invoice invoice) {
        return repo.findAll();
    }
    public Invoice createInvoice(Invoice invoice) {
        return repo.save(invoice);
    }
}