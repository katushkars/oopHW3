package animals;

public abstract class Mammals extends Animals{
    int speed;
    String typeOfFood;


    public Mammals(String name, int age, String habitat,int speed, String typeOfFood) {
        super(name, age, habitat);
        if (speed <= 0) {
            this.speed = 5;
        } else {
            this.speed = speed;
        }
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "не верные данные";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void walk(){
        System.out.println("Гулять!");
    };

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
}
