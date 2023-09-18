package com.leesugyeong.task.service;

import org.springframework.http.ResponseEntity;

import com.leesugyeong.task.dto.request.PostRequestBodyDto;
import com.leesugyeong.task.dto.response.PostResponseDto;

public interface MainService {
    
    String getMethod();
    ResponseEntity< ? super PostResponseDto> postUser(PostRequestBodyDto dto);
    
}
