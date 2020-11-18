package hw.detached;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider); // в стиле JavaBean
    MessageProvider getMessageProvider();
}