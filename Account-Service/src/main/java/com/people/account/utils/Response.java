package com.people.account.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response<T> {
    private T data;
    private String  message;
    private HttpStatus httpStatus;

    private  int returnCode;


}
