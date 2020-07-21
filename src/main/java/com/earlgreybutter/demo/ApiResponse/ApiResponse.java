package com.earlgreybutter.demo.ApiResponse;

import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ApiResponse<T> {
    @NonNull private T data;
    private List<String> errors;
}

// data에 어떤 모델이든 들어갈 수 있음 
// 각 reponse는 항상 errors로 불리는 에러 리스트 가지고 있음 
// 리스폰스마다 List<String> errors를 추가하지 않아도 된다. 