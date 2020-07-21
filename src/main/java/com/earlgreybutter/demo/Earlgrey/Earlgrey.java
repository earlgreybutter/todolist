package com.earlgreybutter.demo.Earlgrey;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Earlgrey {
    private String id;
    private String titile;
    private boolean done;
}