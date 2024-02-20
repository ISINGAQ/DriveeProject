public class Order {
    public int id;
    private static int currentId = 1;
    private double senderPositionX;
    private double senderPositionY;
    private double destinationPositionX;
    private double destinationPositionY;
    private int price;

    public Order(double senderPositionX, double senderPositionY,double destinationPositionX, double destinationPositionY, int price){
        id = currentId;
        currentId++;
        this.destinationPositionX = destinationPositionX;
        this.destinationPositionY = destinationPositionY;
        this.senderPositionX = senderPositionX;
        this.senderPositionY = senderPositionY;
        this.price = price;

    }

    public double getSenderPositionX() {
        return senderPositionX;
    }

    public double getSenderPositionY() {
        return senderPositionY;
    }

    public double getDestinationPositionX() {
        return destinationPositionX;
    }

    public double getDestinationPositionY() {
        return destinationPositionY;
    }

    public double getPrice() {
        return price;
    }






}
