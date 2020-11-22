package hw.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "hw.annotated")
@Configuration
public class HelloWorldConfiguration {
}
