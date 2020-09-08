import java.util.Date;

public class AirlineControl {
    Airline airlines[];
    AirlineControl(Airline airlines[]){
        this.airlines = airlines;
    }
    void getByDestanation(String destanation){
        for (int i = 0; i < airlines.length; ++i){
            if (airlines[i].getDestanation().equals(destanation)){
                System.out.println(airlines[i].toString());
            }
        }
    }
    void getByDayOfWeek(int day){
        for (int i = 0; i < airlines.length; ++i){
            if (airlines[i].getDayOfWeek() == day){
                System.out.println(airlines[i].toString());
            }
        }
    }
    void getByDayOfWeekTime(int day, Date time){
        for (int i = 0; i < airlines.length; ++i){
            if (airlines[i].getDayOfWeek() == day && airlines[i].getTimeOfFlight().getTime() > time.getTime()){
                System.out.println(airlines[i].toString());
            }
        }
    }
}
