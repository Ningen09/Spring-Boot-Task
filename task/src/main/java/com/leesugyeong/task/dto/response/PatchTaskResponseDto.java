package com.leesugyeong.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PatchTaskResponseDto extends ResponseDto {
    public PatchTaskResponseDto(String code, String message){
        super(code, message);
    }
    
}
