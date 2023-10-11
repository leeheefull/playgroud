package com.leeheefull.api.common.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/health")
    fun checkHealth(): String {
        return "health good"
    }
}
