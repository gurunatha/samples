package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value={AopConfig.class,PersistenceConfig.class,ServiceConfig.class,ControllerConfig.class})
public class AppConfig {

}
