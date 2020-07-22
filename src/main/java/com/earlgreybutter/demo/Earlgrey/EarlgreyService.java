package com.earlgreybutter.demo.Earlgrey;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EarlgreyService {

    @Autowired
    private EarlgreyRepository earlgreyRepository;

    public EarlgreyDto get(final String id){
        return earlgreyRepository.findById(id).orElse(null);
    }

    public EarlgreyDto create(final EarlgreyDto earlgreyDto){
        if(earlgreyDto == null){
            throw new NullPointerException("Earlgrey cannot be null.");
        }
        return earlgreyRepository.insert(earlgreyDto);
    }

    public List<EarlgreyDto> getAll(){
        return earlgreyRepository.findAll();
    }
}
// 서비스는 원래는 id 를 받아 JPA Repository 클래스 이용해 DB에서 이 id 를 검색해야함 
// 현재 DB없으므로 임의로 Earlgrey 만들어서 EarlgreyResponse 에 넣어 return