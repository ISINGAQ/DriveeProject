import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static ArrayList<Driver> drivers = new ArrayList<Driver>();
    public static ArrayList<ConfirmedOrder> confirmedOrders = new ArrayList<ConfirmedOrder>();

    public static void main(String[] args) {
        //Здеся просто тест :D

        Driver driver1 = new Driver(62.029967, 129.706906);
        Driver driver2 = new Driver(62.029041, 129.718266);
        Driver driver3 = new Driver(62.028367, 129.728219);
        Driver driver4 = new Driver(62.034832, 129.731427);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);

        Order order1 = new Order(62.025650,129.711742,62.025650,129.711742, 300);


        findDrivers(order1);






    }

    public static double calculateDistance(Driver driver, Order order) {// Оценка расстояния между водителем и заказчиком в км.

        double lat2 = Math.toRadians(order.getSenderPositionX());
        double lon2 = Math.toRadians(order.getSenderPositionY());
        double lat1 = Math.toRadians(driver.getPositionX());
        double lon1 = Math.toRadians(driver.getPositionY());

        double earthRadius = 6371.01;

        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }


    public static void findDrivers(Order order){
        //Поиск водителя
        TreeSet<DriverQueue> availableDrivers = new TreeSet<>();
        for (Driver driver : drivers) {
            if (driver.isAvailable) {
                DriverQueue driverQueue = new DriverQueue(driver, calculateDistance(driver, order));
                availableDrivers.add(driverQueue);
            }
        }
        ConfirmedOrder confirmedOrder = new ConfirmedOrder(order, availableDrivers.first().driver);
        confirmedOrders.add(confirmedOrder);
        System.out.println("ID Воителя: " + availableDrivers.first().driver.id + " ID заказа " + order.id + " расстояние " + availableDrivers.first().distance + "км");


    }



}