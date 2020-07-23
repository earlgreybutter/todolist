package com.earlgreybutter.demo.Earlgrey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EarlgreyRepository extends JpaRepository<EarlgreyDto, String> {
    public List<EarlgreyDto> selectEarlgreyList() throws Exception;
}