package hw.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("singer")
public class Singer {
    @Autowired // внедрение через поле // лучше не пользоваться таким методом
    private Inspiration inspirationBean;

    public void sing(){
        System.out.println("  "+inspirationBean.getLyric());
    }
}
