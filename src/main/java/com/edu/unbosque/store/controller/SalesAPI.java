package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.model.Invoice;
import com.edu.unbosque.store.model.Reports;
import com.edu.unbosque.store.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class SalesAPI {

    @Autowired
    private UserService userService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private ProductService productService;
    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private ReportService reportService;


    @GetMapping("/ventas")
    public String showSales(Model model){
        model.addAttribute("users",userService.listUsers());
        model.addAttribute("clients", clientService.listClients());
        model.addAttribute("products", productService.listProducts());
        return "sales";
    }


    @PostMapping("/venta/guardar")
    public String saveInvoice(Invoice invoice, Model model) {
        invoiceService.saveInvoice(invoice);
        return "redirect:/ventas";
    }

    @GetMapping("/venta/listar")
    public String saveInvoice(Model model) {
        List<Reports> reportsByCli =reportService.getReportsList();
        model.addAttribute("reportsByClient",reportsByCli);
        return "reportSales";
    }
}
