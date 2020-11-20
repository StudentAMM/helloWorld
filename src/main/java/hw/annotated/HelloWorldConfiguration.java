package hw.annotated;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "hw.detached")
@Configuration
public class HelloWorldConfiguration {
}
