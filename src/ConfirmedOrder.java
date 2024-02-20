public class ConfirmedOrder {
    //Является уже подтверженный заказ
    Order order;
    Driver driver;

    public ConfirmedOrder(Order order, Driver driver){
        this.order = order;
        this.driver = driver;
        driver.isAvailable = false; //При принятии заказа он больше не будет попадать в список претендентов
    }
}
