package com.edu.unbosque.store.service.implement;

import com.edu.unbosque.store.model.Reports;
import com.edu.unbosque.store.repository.IReports;
import com.edu.unbosque.store.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImp implements ReportService {

    @Autowired
    private IReports data;

    @Override
    public List<Reports> getReportsList() {
        return (List<Reports>) data.findAll();
    }
}
