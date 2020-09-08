import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    String destanation;
    int flight;
    String type;
    Date time;
    int dayOfWeek;
    SimpleDateFormat format = new SimpleDateFormat("hh:mm");
    Airline (String destanation, int flight, String type, String time, int dayOfWeek) throws ParseException {
        this.destanation = destanation;
        this.flight = flight;
        this.type = type;
        this.time = format.parse(time);
        this.dayOfWeek = dayOfWeek;
    }
    void setDestanation(String destanation) {
        this.destanation = destanation;
    }
    void setFlight(int flight) { this.flight = flight; }
    void setType(String type){this.type = type;}
    void setRelease(Date time){
        this.time = time;
    }
    void setDayOfWeek(int dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }
    String getDestanation() {
        return destanation;
    }
    int getFlight() {
        return flight;
    }
    String getType(){return type;}
    Date getTimeOfFlight(){
        return time;
    }
    int getDayOfWeek(){
        return dayOfWeek;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder(destanation + " " + flight + " " + type + " " + time + " ");
        if (dayOfWeek == 1){
            result.append("Monday");
        }
        if (dayOfWeek == 2){
            result.append("Tusday");
        }
        if (dayOfWeek == 3){
            result.append("Wensday");
        }
        if (dayOfWeek == 4){
            result.append("Thursday");
        }
        if (dayOfWeek == 5){
            result.append("Friday");
        }
        if (dayOfWeek == 6){
            result.append("Saturday");
        }
        if (dayOfWeek == 7){
            result.append("Sunday");
        }
        return new String(result);
    }
}
