package com.nt.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistenceBeanConfigurator.class,ServiceBeanConfigurator.class})
public class BeanConfigurator {

}
