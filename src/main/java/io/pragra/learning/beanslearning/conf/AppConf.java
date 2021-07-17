package io.pragra.learning.beanslearning.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "io.pragra.learning.beanslearning")
@PropertySource("classpath:application.properties")
@Configuration
public class AppConf {

}
