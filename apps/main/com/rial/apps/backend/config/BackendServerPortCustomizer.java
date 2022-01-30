package com.rial.apps.backend.config;

import com.rial.shared.infrastructure.config.Parameter;
import com.rial.shared.infrastructure.config.ParameterNotExist;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class BackendServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
    private final Parameter param;

    public BackendServerPortCustomizer(Parameter param) {
        this.param = param;
    }

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        try {
            factory.setPort(param.getInt("BACKEND_SERVER_PORT"));
        } catch(ParameterNotExist parameterNotExist) {
            parameterNotExist.printStackTrace();
        }
    }
}
