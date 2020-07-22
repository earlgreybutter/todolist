package com.earlgreybutter.demo.Earlgrey;

import java.util.List;

import com.earlgreybutter.demo.ApiResponse.ApiResponse;

import lombok.Builder;

public class EarlgreyResponse extends ApiResponse<EarlgreyDto> {
// ApiResponse의 T자리에 Earlgrey가 들어갔다.     
    @Builder
    public EarlgreyResponse(final EarlgreyDto earlgreyDto, final List<String> errors){
        super(earlgreyDto);
        this.setErrors(errors);
    }
    // 생성자에서 부모 클래스인 ApiResponse 의 data를 earlgrey 로 초기화 해줌 
    // 모델 노출 시, 보안 문제가 있을 경우, 멤버변수들을 따로 가져와야 함 
}