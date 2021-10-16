package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Invoice;
import com.edu.unbosque.store.repository.IInvoice;

import java.util.List;


public interface InvoiceService {

    int saveInvoice(Invoice i);

    void save(Invoice invoice);
}
