package com.leesugyeong.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DeleteTaskResponseDto extends ResponseDto{

    public DeleteTaskResponseDto(String code, String message){
        super(code, message);
    }
}
