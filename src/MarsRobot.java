public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

   public void checkTemperature(){
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }

    @Override
    public void checkStatus() {
        System.out.println("Status jest:" + status);
    }
}
