package net.example;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableSwagger
@ComponentScan("com.myapp.packages")
public class WebAppConfig {
}