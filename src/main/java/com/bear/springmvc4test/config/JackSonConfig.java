package com.bear.springmvc4test.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/11 下午4:55
 * Description:
 */

@Configuration
public class JackSonConfig {

//    @Bean
//    public Jackson2ObjectMapperBuilder jacksonBuilder() {
//        System.out.println("JackSonConfig");
//        Jackson2ObjectMapperBuilder b = new Jackson2ObjectMapperBuilder();
//        b.propertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
//        return b;
//    }
}
