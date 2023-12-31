package com.leesugyeong.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostResponseDto extends ResponseDto{

    public PostResponseDto(String code, String message){
        super(code, message);
    }
    
}