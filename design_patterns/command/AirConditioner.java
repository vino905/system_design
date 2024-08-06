package command;

public class AirConditioner {
    boolean isAcOn;
    int temprature;

    public void turnOnAC() {
        isAcOn = true;
        System.out.println("Ac is on");
    }

    public void turnOfAc() {
        isAcOn = false;
        System.out.println("Ac is off");
    }

    public void setTemprature(int temp) {
        temprature = temp;
        System.out.println("Temperature is set : " + temp);
    }
}
