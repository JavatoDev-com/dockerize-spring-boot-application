package com.javatodev.api.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIResponse {
    private String message;
}
