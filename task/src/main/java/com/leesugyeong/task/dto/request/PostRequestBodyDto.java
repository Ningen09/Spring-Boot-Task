package com.leesugyeong.task.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    
    //이름
    @NotEmpty
    private String name;
    
    //카테고리
    @NotEmpty
    private String category;
    
    //내용
    @NotEmpty
    private String discription;
    
    //날짜
    @NotEmpty
    private String date;
    
    //시간
    @NotEmpty
    private String time;
    
}
