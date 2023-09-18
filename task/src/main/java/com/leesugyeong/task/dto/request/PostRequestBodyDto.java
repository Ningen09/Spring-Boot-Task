package com.leesugyeong.task.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    
    @NotBlank
    private String name;
    
    @NotBlank
    private String category;
    
    @NotBlank
    private String text;
    
    @NotBlank
    private String date;
    
    @NotBlank
    private String time;
    
}
