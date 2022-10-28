package animals;

public  abstract class Birds extends Animals {

    public Birds(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public void eat(){
        System.out.println("Я охотник!");
    }
}
