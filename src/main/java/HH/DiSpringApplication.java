package HH;

import HH.other_package.Bike;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("HH.other_package") // cách 1: chỉ quét bean ở package HH.other_package thôi,
// muốn quét nhiều thì @ComponentScan({"HH.other_package","HH"})
//@SpringBootApplication(scanBasePackages = {"HH.other_package"}) Cách 2!!
@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiSpringApplication.class, args);

//       1: test bean và @ComponentScan
//        Car car = context.getBean(Car.class);
//        System.out.println("Car: " + car);
//
//        Bike bike = context.getBean(Bike.class);
//        System.out.println("Bike: " + bike);
//***********************************************************************

//       2:   @Autowired
//        Brand brand = context.getBean(Brand.class);
//        System.out.println("Instance Brand: " + brand);
//        //nếu chạy chương trình mà chưa có @Autowire bên Brand thì nó bị lỗi vì chưa khởi tạo giá trị
//        System.out.println("Car of brand: " + brand.car);
//        brand.car.name();
//***********************************************************************

//       3:   @Scope
//        Car car1 = context.getBean(Car.class);
//        Car car2 = context.getBean(Car.class);
//        // nếu chưa có @Scope("prototype") ở class Car thì 2 Objects này đều trỏ tới 1 địa chỉ ô nhớ!
//        System.out.println("Car1: " + car1); // Car1: HH.Car@65ac658f
//        System.out.println("Car2: " + car2); // Car2: HH.Car@65ac658f
//***********************************************************************

//        4: @Primary và @Order
        Brand brand = context.getBean(Brand.class);
        System.out.println("Brand: " + brand);
        System.out.println("Engine of brand: " + brand.engine);
// hiện tại chúng ta có 2 class đều iml tới Engine và mình bấm chạy thì nó sẽ quét và sẽ có 2 bean và
//        nó sẽ khongo biết chọn cái nào nên nó sẽ báo lỗi và muốn khắc phục lỗi này thì dùng @Primary
    }

}
