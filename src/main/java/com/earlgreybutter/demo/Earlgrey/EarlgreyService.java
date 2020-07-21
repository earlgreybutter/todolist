package com.earlgreybutter.demo.Earlgrey;

import com.earlgreybutter.demo.Earlgrey.Earlgrey;

import org.springframework.stereotype.Service;

@Service
public class EarlgreyService {
    public Earlgrey get(final String id){
        return Earlgrey.builder()
            .titile("title")
            .build();

    }
}
// 서비스는 원래는 id 를 받아 JPA Repository 클래스 이용해 DB에서 이 id 를 검색해야함 
// 현재 DB없으므로 임의로 Earlgrey 만들어서 EarlgreyResponse 에 넣어 return