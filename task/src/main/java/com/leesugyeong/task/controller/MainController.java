package com.leesugyeong.task.controller;

import javax.validation.Valid;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leesugyeong.task.dto.request.PatchRequestDto;
import com.leesugyeong.task.dto.request.PostRequestBodyDto;
import com.leesugyeong.task.dto.response.DeleteTaskResponseDto;
import com.leesugyeong.task.dto.response.GetTaskResponseDto;
import com.leesugyeong.task.dto.response.PatchTaskResponseDto;
import com.leesugyeong.task.dto.response.PostResponseDto;
import com.leesugyeong.task.dto.response.ResponseDto;
import com.leesugyeong.task.service.MainService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")

//@RequiredArgsConstructor
public class MainController {
    
    //private final MainService mainService;

    //일정 작성하기
    @PostMapping("task")
    public ResponseEntity<PostResponseDto> postTask(@RequestBody PostRequestBodyDto reqeustBody){
        
        return null;
    }

    //일정 불러오기
    @GetMapping("/task/{taskNumber}")
    public ResponseEntity<GetTaskResponseDto> getTask (@PathVariable("taskNumber") Integer taskNumber){

        return null;
        
    }

    //일정 수정하기
    @PatchMapping("/task/{taskNumber}")
    public ResponseEntity<PatchTaskResponseDto> patchTask(@RequestBody PatchRequestDto reqeustBody){
       
        return null;
    }

    //일정 삭제하기
    @DeleteMapping("/task/{taskNumber}")
    public ResponseEntity<DeleteTaskResponseDto> deleteTask(@PathVariable("taskNumber") Integer tasknumber){
        return null;
    }

    
}

