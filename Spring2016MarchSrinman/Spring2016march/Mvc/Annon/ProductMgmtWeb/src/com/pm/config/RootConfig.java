package com.pm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:com/pm/common/application-context.xml")
@ComponentScan({"com.pm.dao", "com.pm.service"})
public class RootConfig {

}
