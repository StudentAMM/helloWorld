package hw.detached;

import java.io.FileInputStream;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties = new Properties();
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory(){
        try{

            properties.load(new FileInputStream("src\\main\\resources\\msf.properties"));

            String rendererClass = properties.getProperty("render.class");
            String providerClass = properties.getProperty("provider.class");
            renderer = (MessageRenderer)Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider)Class.forName(providerClass).getDeclaredConstructor().newInstance();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRenderer getRenderer(){
        return renderer;
    }

    public MessageProvider getProvider(){
        return provider;
    }
}
