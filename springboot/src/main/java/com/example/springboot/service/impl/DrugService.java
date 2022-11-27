package com.example.springboot.service.impl;

import com.example.springboot.entity.Drug;
import com.example.springboot.mapper.DrugMapper;
import com.example.springboot.service.IDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService implements IDrugService {

    @Autowired
    DrugMapper drugMapper;

    @Override
    public List<Drug> list() {
        return drugMapper.list();
    }
}
