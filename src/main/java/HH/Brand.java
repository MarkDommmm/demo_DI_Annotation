package HH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Brand {
    @Autowired // Có thể thêm vào phương thức, constructor, setter
    public Engine engine;
//@Autowired
//public Car car;

    public Brand() {
    }

//    public Brand(Car car) {
//        this.car = car;
//    }
//
//    public Car getCar() {
//        return car;
//    }
//
//    public void setCar(Car car) {
//        this.car = car;
//    }

    public Brand(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
