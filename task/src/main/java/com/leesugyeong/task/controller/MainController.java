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
import com.leesugyeong.task.dto.response.PostResponseDto;
import com.leesugyeong.task.dto.response.ResponseDto;
import com.leesugyeong.task.service.MainService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1")

//@RequiredArgsConstructor
public class MainController {
    
    //private final MainService mainService;

    @PostMapping("task")
    public String postMetod(@RequestBody PostRequestBodyDto requestBody){
        
        return "일정이름 : " +  requestBody.getName() + "카테고리 : " + requestBody.getCategory() + 
        "설명 : " + requestBody.getText() + "날짜 : " + requestBody.getDate() + "시간 : " + requestBody.getTime();
    }

    @GetMapping("/task/{taskNumber}")
    public ResponseEntity<ResponseDto> getResponseEntity() {
        ResponseDto responseBody = new ResponseDto("code", "message");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    @PatchMapping("/task/{taskNumber}")
    public String PatchMetod(@RequestBody PatchRequestDto requestBody){
       return "번호 : " + requestBody.getNumber() + " 일정이름 : " +  requestBody.getName() + "카테고리 : " + requestBody.getCategory() + 
        "설명 : " + requestBody.getText() + "날짜 : " + requestBody.getDate() + "시간 : " + requestBody.getTime();
    }

    @DeleteMapping("/task/{taskNumber}")
    public String DeleteMethod(){
        return "This method is Delete method";
    }

    
}

