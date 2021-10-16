package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.Reports;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IReports extends CrudRepository <Reports, Long> {

}
