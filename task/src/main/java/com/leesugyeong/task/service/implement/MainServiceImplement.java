package com.leesugyeong.task.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.leesugyeong.task.dto.request.PostRequestBodyDto;
import com.leesugyeong.task.dto.response.PostResponseDto;
import com.leesugyeong.task.dto.response.ResponseDto;
import com.leesugyeong.task.service.MainService;

public class MainServiceImplement implements MainService {
    
    @Override
    public String getMethod(){
        return "test";
    }

    @Override
    public PostResponseDto<DTO> postUser(PostRequestBodyDto dto) {

        return new ResponseDto();
    }

}