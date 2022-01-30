package com.rial.apps.backend.controller;

import com.rial.shared.domain.DomainError;
import com.rial.shared.domain.bus.command.CommandBus;
import com.rial.shared.domain.bus.query.QueryBus;
import com.rial.shared.infrastructure.spring.ApiController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckGetController extends ApiController {
    public HealthCheckGetController(
            QueryBus queryBus,
            CommandBus commandBus
    ) {
        super(queryBus, commandBus);
    }

    @GetMapping("/health-check")
    public HashMap<String, String> index() {
        HashMap<String, String> status = new HashMap<>();
        status.put("application", "backend");
        status.put("status", "ok");

        return status;
    }

    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() { return null; }
}
