package com.rial.apps.backoffice;

import com.rial.shared.domain.Service;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication()
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = {"com.rial.shared", "com.rial.backoffice", "com.rial.apps.backoffice"}
)
public class BackofficeApplication { }
