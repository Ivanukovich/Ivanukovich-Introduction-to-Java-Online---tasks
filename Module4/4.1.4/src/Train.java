import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Создайте класс с именем train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа train, добавить возможность сортировки
элементов по номерам поездов.
Добавить возможность вывода информации о поезде, номер которого введен пользователем.
Добавить возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Train {
    String destanation;
    int number;
    Date time;
    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    Train(String destanation, int number, String time) throws ParseException {
        this.destanation = destanation;
        this.time = format.parse(time);
        this.number = number;
    }
    int getNumber (){
        return number;
    }
    void showInfo(){
        System.out.println(this.number);
        System.out.println(this.destanation);
        System.out.println(format.format(time.getTime()));
    }
    boolean compare(Train element){
        if (this.destanation.equals(element.destanation)) {
            return this.time.compareTo(element.time) > 0;
        }
        else {
            int i = 0;
            while (i < element.destanation.length() - 1 && i < this.destanation.length() - 1 && this.destanation.charAt(i) == element.destanation.charAt(i)) {
                ++i;
            }
            return element.destanation.charAt(i) < this.destanation.charAt(i);
        }
    }
}
