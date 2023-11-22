public class Car {
    void drive (){
        System.out.println("Driving");
    }
}
class Audi extends Car {
    void autoDrive(){
        System.out.println("Auto Drive");
    }
}
class Audi1572 extends Audi {
    void flying() {
        System.out.println("Flying");

    }
}
class test {
    public static void main(String[] args) {
        Audi1572 a = new Audi1572();
        a.flying();
        a.drive();
        a.autoDrive();
    }
}
