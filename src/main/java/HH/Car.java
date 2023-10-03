package HH;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") // "singleton" là giá trị mặc định của scope
public class Car implements Engine{
    @Override
    public  void name(){
        System.out.println("GTR-99");
    }
}
