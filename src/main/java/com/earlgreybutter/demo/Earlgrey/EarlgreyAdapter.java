package com.earlgreybutter.demo.Earlgrey;

import java.util.List;

// Earlgrey를 EarlgreyResponse로 바꿔줌 
public class EarlgreyAdapter {
    public static EarlgreyResponse earlgreyResponse(final Earlgrey earlgrey, final List<String> errors){

        return EarlgreyResponse.builder().earlgrey(earlgrey).errors(errors).build();
    }
    // earlgreyResponse 메서드가 earlgrey와 errors 리스트를 받아 EarlgreyResponse 를 만들어줌 

}