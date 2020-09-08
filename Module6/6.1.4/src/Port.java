import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*

Корабли заходят в порт для разгрузки/загрузки контейнеров.
Число контейнеров, находящихся в текущий момент в порту и на корабле,
должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта.
В порту работает несколько причалов. У одного причала может стоять один корабль.
Корабль может загружаться у причала, разгружаться или выполнять оба действия.
 */

public class Port {
    public static void main(String[] args) {
        int maxCapacity = 10;
        Semaphore port = new Semaphore(2);
        Semaphore stock = new Semaphore(maxCapacity);
        Ship ship1 = new Ship(port, stock, 10);
        Ship ship2 = new Ship(port, stock, -10);
        Ship ship3 = new Ship(port, stock, 5);
    }
}
class Ship extends Thread
{
    private int cargo;
    private Semaphore port;
    private Semaphore stock;
    Ship (Semaphore port, Semaphore stock, int cargo)
    {
        this.port = port;
        this.stock = stock;
        this.cargo = cargo;
        this.start();
    }
    @Override
    public void run()
    {
        System.out.println(this.getName() + " waiting for port");
        try {
            port.acquire(); //ограничение на причалы
            cargoTransfer();
            port.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ship.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void cargoTransfer()
    {
        System.out.println(this.getName() + " arrived to port");
        try {
            if (cargo > 0){ //загрузка на склад
                stock.acquire(cargo);
                System.out.println(this.getName() + " uploaded cargo");
            }
            this.sleep(10000);
            if (cargo < 0) {
                stock.release(-cargo); //разгрузка со склада
                System.out.println(this.getName() + " downloaded cargo");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Ship.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}