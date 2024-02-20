import java.util.*;
class DriverQueue implements Comparable<DriverQueue>{
    //Это тупо класс для хранения как экземпляров класса Driver, так и их расстояния до заказчика
    public Double distance;
    public Driver driver;

    public DriverQueue(Driver driver, double distance){
        this.distance = distance;
        this.driver = driver;
    }


    @Override
    public int compareTo(DriverQueue o) {
        return this.distance.compareTo(o.distance);
    }

}
