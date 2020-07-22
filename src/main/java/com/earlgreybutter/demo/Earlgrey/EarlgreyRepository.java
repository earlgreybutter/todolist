package com.earlgreybutter.demo.Earlgrey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface EarlgreyRepository extends JpaRepository<EarlgreyDto, String> {
    public List<EarlgreyDto> selectEarlgreyList() throws Exception;
}