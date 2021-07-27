package com.example.jirabackend.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private Integer errorCode = 0;
    private String errMsg = "";
    private Object data;

    public Response (Object data) {
        this.data = data;
    }
}
