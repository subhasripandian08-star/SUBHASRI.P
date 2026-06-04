package Day4.Day5.Day6.Day7;
class Car {
    String brand;
    int speed;
    void drive(){
        System.out.println(brand + " car is driving at " + speed + " km/h ");
    }
}

public class Obj1 {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand="BMW";
        c1.speed=120;

        c1.drive();
    }
    
}


