package com.rial.apps.backend.controller.health_check;

import com.rial.apps.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;


public final class HealthCheckGetControllerTestCase extends ApplicationTestCase {
    private final Logger logger = LoggerFactory.getLogger(HealthCheckGetControllerTestCase.class);

    @Test
    void checkTheAppIsWorkingOk() throws Exception {
        HttpHeaders headers = new HttpHeaders();

        logger.info("There is running this test");

        assertResponse(
                "/health-check",
                200,
                "{'application': 'backend', 'status': 'ok'}",
                headers);
    }

}
