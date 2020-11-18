package hw;

import hw.detached.HelloWorldMessageProvider;
import hw.detached.MessageProvider;
import hw.detached.MessageRenderer;
import hw.detached.StandardOutMessageRenderer;

public class HelloWorld {
    public static void main(String[] args){
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}

