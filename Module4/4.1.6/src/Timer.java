public class Timer {
    int hour = 0;
    int minute = 0;
    int second = 0;
    Timer (int hour, int minute, int second){
        if (hour <= 23 && hour >= 0) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
        if (minute <= 59 && minute >= 0){
            this.minute = minute;
        }
        else {
            this.minute = 0;
        }
        if (second <= 59 && second >= 0){
            this.second = second;
        }
        else {
            this.second = 0;
        }
    }
    void output(){
        if (hour < 10){
            System.out.print("0"+hour+":");
        }
        else {
            System.out.print(hour + ":");
        }
        if (minute < 10){
            System.out.print("0"+minute+":");
        }
        else {
            System.out.print(minute + ":");
        }
        if (second < 10){
            System.out.print("0"+second + "\n");
        }
        else {
            System.out.print(second + "\n");
        }
    }
    void increase (int hour, int minute, int second) {
        this.second += second;
        this.minute = this.minute  + minute + this.second/60;
        this.second %= 60;
        this.hour = (this.hour + hour + this.minute/60)%24;
        this.minute %= 60;
    }
    void decrease (int hour, int minute, int second) {
        this.second -= second;
        this.minute -= minute;
        if (this.second < 0) {
            this.minute -= Math.abs(this.second)/60 + 1;
            this.second += (Math.abs(this.second)/60 + 1) * 60;
        }
        this.hour -= hour;
        if (this.minute < 0) {
            this.hour -= Math.abs(this.minute)/60 + 1;
            this.minute += (Math.abs(this.minute)/60 + 1) * 60;
        }
        if (this.hour < 0){
            this.hour += (Math.abs(this.hour)/24 + 1) * 24;
        }

    }
}
