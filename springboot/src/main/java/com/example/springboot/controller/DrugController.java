package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.entity.Drug;

import com.example.springboot.service.IDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    IDrugService drugService;

    @GetMapping("list")
    public Result list(){
        List<Drug> list = drugService.list();
        return Result.success(list);
    }
}
