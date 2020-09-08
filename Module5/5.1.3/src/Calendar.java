public class Calendar {
    int year;
    Month []months = new Month[12];
    Calendar (int dayOfWeek, int year){
        this.year = year;
        for (int i = 0; i < 12; ++i){
            months[i] = new Month(i, dayOfWeek, year);
            dayOfWeek += months[i].getNumberOfDays();
            dayOfWeek %= 7;
        }
    }
    void setHolyday(int month, int day){
        months[month].setHolyday(day);
    }
    void setWorkDay(int month, int day){
        months[month].setWorkDay(day);
    }
    void outPut(){
        for (int i = 0; i < 12; ++i){
            months[i].outPut();
            System.out.println();
        }
    }
    class Month{
        int firstDayOfWeek;
        boolean[] days;
        Month(int number, int dayOfWeek, int year){
            firstDayOfWeek = dayOfWeek;
            if (number == 0 || number == 2 || number == 4 || number == 6 || number == 7 || number == 9 || number == 11){
                days = new boolean[31];
            }
            else {
                if (number == 1){
                    if (year % 4 == 0){
                        days = new boolean[29];
                    }
                    else {
                        days = new boolean[28];
                    }
                }
                else {
                    days = new boolean[30];
                }
            }
            for (int i = 0; i < days.length; ++i){
                if (dayOfWeek < 5){
                    days[i] = false;
                }
                else {
                    days[i] = true;
                }
                ++dayOfWeek;
                dayOfWeek %= 7;
            }
        }
        int getNumberOfDays(){
            return days.length;
        }
        void setHolyday(int day){
            days[day] = true;
        }
        void setWorkDay (int day){
            days[day] = false;
        }
        void outPut(){
            int dayOfWeek = firstDayOfWeek;
            for (int i = 0; i < dayOfWeek; ++i){
                System.out.print("    ");
            }
            for (int i = 0; i < days.length; ++i){
                if (days[i]) {
                    if (i < 9){
                        System.out.print(" *" + (i + 1));
                    }
                    else {
                        System.out.print("*" + (i + 1));
                    }
                }
                else {
                    if (i < 9){
                        System.out.print("  " + (i + 1));
                    }
                    else {
                        System.out.print(" " + (i + 1));
                    }
                }
                if (dayOfWeek == 6){
                    dayOfWeek = 0;
                    System.out.print("\n");
                }
                else {
                    ++dayOfWeek;
                    System.out.print(" ");
                }
            }
        }
    }
}
