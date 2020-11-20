package hw.detached;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired  // внедрение зависимости через конструктор
    public ConfigurableMessageProvider(@Value("Configurable message") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
