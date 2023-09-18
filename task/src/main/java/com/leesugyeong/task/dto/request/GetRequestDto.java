package com.leesugyeong.task.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetRequestDto extends PostRequestBodyDto {

    private String code;

    private String message;
    
    private String number;
    
}
