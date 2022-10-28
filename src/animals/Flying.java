package animals;

public class Flying extends Birds{
    public Flying(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void go() {
        System.out.println("Я летаю");
    }
}
