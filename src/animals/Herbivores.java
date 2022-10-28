package animals;

public class Herbivores extends Mammals{

    public Herbivores(String name, int age, String habitat, int speed, String typeOfFood) {
        super(name, age, habitat, speed,typeOfFood);
    }
    public void eat(){
        System.out.println("Я ем травку на лугу!");
    }

    @Override
    public String toString() {
        return "ТИП: Травоядные: "
                +getName()+
                ", возраст: " +getAge()+
                ", среда обитания: " +getHabitat() +
                ", скорость:" + speed +
                ", тип еды='" + typeOfFood + '\''
                ;
    }
}

