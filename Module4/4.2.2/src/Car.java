public class Car {
    Wheel[] wheels = new Wheel[4];
    Engine engine;
    String mark;
    double maxFuel;
    double fuel;
    Car (Wheel[] wheels, Engine engine, String mark, double maxFuel){
        for (int i = 0; i < 4; ++i){
            this.wheels[i] = wheels[i];
        }
        this.engine = engine;
        this.mark = mark;
        this.maxFuel = maxFuel;
        this.fuel = 0;
    }
    double drive (double length){
        double result;
        double fuelNeed = length / engine.getKpd();
        if (fuelNeed <= fuel){
            fuel -= fuelNeed;
            result = length;
        }
        else {
            result =  engine.getKpd() * fuel;
            fuel = 0;
        }
        return result;
    }
    void refueling(double newFuel){
        fuel = fuel + newFuel;
        if (fuel > maxFuel){
            fuel = maxFuel;
        }
    }
    void changeWheel (int num, Wheel newWheel){
        wheels[num - 1] = newWheel;
    }
    void printMark(){
        for (int i = 0; i < 4; ++i){
            System.out.println(wheels[i].mark);
        }
        System.out.println(mark);
    }
}
