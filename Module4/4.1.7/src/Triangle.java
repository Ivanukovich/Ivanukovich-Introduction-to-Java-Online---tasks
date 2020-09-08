/*
Описать класс, представляющий треугольник.
Предусмотреть методы для создания объекта, вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    double ax;
    double ay;
    double bx;
    double by;
    double cx;
    double cy;
    double ab;
    double ac;
    double bc;
    Triangle(double ax, double ay, double bx, double by, double cx, double cy){
        if ((ax != bx || ay!= by) && (ax != cx || ay!= cy) &&(cx != bx || cy!= by)) {
            this.ax = ax;
            this.ay = ay;
            this.bx = bx;
            this.by = by;
            this.cx = cx;
            this.cy = cy;
            this.ab = Math.sqrt(Math.pow(ay - by, 2) + Math.pow(ax - bx, 2));
            this.bc = Math.sqrt(Math.pow(by - cy, 2) + Math.pow(bx - cx, 2));
            this.ac = Math.sqrt(Math.pow(ay - cy, 2) + Math.pow(ax - cx, 2));
        }
    }
    double P(){
        return ab + bc + ac;
    }
    double S(){
        double p = this.P()/2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
    double[] medianeCentre(){
        double[] coordinates = new double[2];
        coordinates[0] = (ax + bx)/2 + (cx - (ax + bx)/2)/3;
        coordinates[1] = (ay + by)/2 + (cy - (ay + by)/2)/3;
        return coordinates;
    }

}
