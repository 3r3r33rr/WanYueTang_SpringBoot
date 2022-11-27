package com.example.springboot.mapper;

import com.example.springboot.entity.Drug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DrugMapper {
    List<Drug> list();
}
