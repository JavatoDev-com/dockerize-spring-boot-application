package com.javatodev.api.controller;

import com.javatodev.api.model.dto.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class BaseController {

    @GetMapping(value = "/base")
    public ResponseEntity<APIResponse> readBaseResponse () {
        return ResponseEntity.ok(APIResponse.builder().message("API Running").build());
    }

}
