package org.spring.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.spring.application")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
