public class Driver {
    public int id;
    private static int currentId = 1;
    private double positionX;
    private double positionY;
    public boolean isAvailable = true;



    public Driver(double positionX, double positionY){
        id = currentId;     //ID для водителей выдается автоматиески
        currentId++;
        this.positionX = positionX;
        this.positionY = positionY;

    }
    public double getPositionX() {
        return positionX;
    }


    public double getPositionY() {
        return positionY;
    }

    public void getCurrentPosition(){
        //Вызывается для изменения текущих координат водителя
        //positionX = gottenPositionX;
        //positionY = gottenPositionY;
    }






}
