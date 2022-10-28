package transport;

public class Bus extends Transport{


    public Bus(String marka, String model, int year, String country, String color, int maxSpeed) {
        super(marka, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизелем или бензином!");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Марка" +getMarka()+
                ", модель" + getModel() +
                ", год" + getYear() +
                ", страна" + getCountry() +
                ", цвет'" + color + '\'' +
                ", скорость" + maxSpeed +
                '}';
    }
}
