package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ServiceBeanConfigurator.class,PersistenceBeanConfigurator.class})
public class BeanConfigurator {

}
