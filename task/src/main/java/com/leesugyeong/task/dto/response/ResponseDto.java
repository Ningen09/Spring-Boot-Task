package com.leesugyeong.task.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto<DTO> {
    private String code;
    private String message;
}

