package com.leesugyeong.task.dto.request;


import javax.validation.constraints.NotBlank;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatchRequestDto extends PostRequestBodyDto {

    private String number;
    
}