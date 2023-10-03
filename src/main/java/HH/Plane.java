package HH;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Order(1) số càng nhỏ thì độ ưu tiên càng cao
public class Plane implements  Engine {
    @Override
    public void name() {
        System.out.println("Boeing 777");
    }
}
