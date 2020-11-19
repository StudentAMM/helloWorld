package hw.annotated;

import hw.detached.HelloWorldMessageProvider;
import hw.detached.MessageProvider;
import hw.detached.MessageRenderer;
import hw.detached.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }
    @Bean
    public MessageRenderer renderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
