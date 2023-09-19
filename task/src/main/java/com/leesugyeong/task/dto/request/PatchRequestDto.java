package com.leesugyeong.task.dto.request;


import javax.validation.constraints.NotBlank;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatchRequestDto {

    
    private Integer number;
    
    //이름
    @NotBlank
    private String name;
    
    //카테고리
    @NotBlank
    private String category;
    
    //내용
    @NotBlank
    private String discription;
    
    //날짜
    @NotBlank
    private String date;
    
    //시간
    @NotBlank
    private String time;
    
}