package com.earlgreybutter.demo.Earlgrey;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EarlgreyDto {

    @Id
    private String id;
    private String title;
    private boolean done;
}