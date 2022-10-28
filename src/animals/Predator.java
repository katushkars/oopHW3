package animals;

public class Predator extends Mammals {
    public Predator(String name, int age, String habitat, int speed, String typeOfFood) {
        super(name, age, habitat, speed, typeOfFood);
    }

    public void eat() {
        System.out.println("Я ем мяссооо!");
    }

    public String toString() {
        return "ТИП: Хищники: "
                + getName() +
                ", возраст: " + getAge() +
                ", среда обитания: " + getHabitat() +
                ", скорость:" + speed +
                ", тип еды='" + typeOfFood + '\''
                ;
    }
}
