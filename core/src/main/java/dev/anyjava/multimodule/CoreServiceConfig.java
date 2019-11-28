package dev.anyjava.multimodule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackageClasses = CoreServiceConfig.class)
@Configuration
public class CoreServiceConfig {
}
