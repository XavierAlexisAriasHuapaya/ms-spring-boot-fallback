package dev.arias.huapaya.ms_maintenance_fallback.presentation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "fallback")
public class FallbackController {

    @GetMapping
    public ResponseEntity<?> getFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("message",
                "The service is temporarily unavailable due to technical problems. We are working to resolve it as soon as possible. Please try again in a few minutes. We appreciate your patience.");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
