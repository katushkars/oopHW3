package animals;

public class Flightless extends Birds {
    public Flightless(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void go() {
        System.out.println("Я не умею летать");
    }

    public String toString() {
        return "ТИП: Птицы.Нелетающие: "
                + getName() +
                ", возраст: " + getAge() +
                ", среда обитания: " + getHabitat();
    }
}
