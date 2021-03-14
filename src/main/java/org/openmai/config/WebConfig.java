package org.openmai.config;

import org.openmai.beans.MAIRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc
//@Configuration
public class WebConfig implements WebMvcConfigurer {


@Bean
@RequestScope
public MAIRequest maiRequest() {
    return new MAIRequest();
}

}
