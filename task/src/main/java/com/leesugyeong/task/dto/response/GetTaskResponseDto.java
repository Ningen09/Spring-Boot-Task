package com.leesugyeong.task.dto.response;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetTaskResponseDto extends ResponseDto{

    private String code;

    private String message;

    private Integer taskNumber;
    
    private String taskName;
    
    private String category;
    
    private String discription;
    
    private String date;
    
    private String time;
    
    
}
