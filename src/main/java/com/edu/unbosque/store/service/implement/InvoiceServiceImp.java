package com.edu.unbosque.store.service.implement;

import com.edu.unbosque.store.model.Invoice;
import com.edu.unbosque.store.repository.IInvoice;
import com.edu.unbosque.store.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InvoiceServiceImp implements InvoiceService {

    @Autowired
    private IInvoice dataInvoice;


    @Override
    public int saveInvoice(Invoice i) {
        int res = 0;
        Invoice invoice = dataInvoice.save(i);
        if(!invoice.equals(null)){
            res = 1;
        }
        return res;
    }
}