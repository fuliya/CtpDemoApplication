package com.bcbsmn.CTPDemo.ResponseHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class JsonResponseHandler {
    public static ResponseEntity<Object> responseBuilder(String key, Object responseObject){
        Map<String, Object> response = new HashMap<>();
        response.put(key, responseObject);
        //response.put();

        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
}
