package animals;

public class Amphibians extends Animals{

    public Amphibians(String name, int age, String habitat) {
        super(name, age, habitat);
    }
    public void eat(){
        System.out.println("Я охотник!");
    }

    @Override
    public String toString() {
        return "ТИП: Земноводные: "
                +getName()+
                ", возраст: " +getAge()+
                ", среда обитания: " +getHabitat();

    }
}
