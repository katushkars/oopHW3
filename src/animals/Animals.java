package animals;

public abstract class Animals {
    private String name;
    private  int age;
    private String habitat;

    public Animals(String name, int age, String habitat) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "не верные данные";
        } else {
            this.name = name;
        }
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "не верные данные";
        } else {
            this.habitat = habitat;}

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void eat(){}
    public void go(){}
    public void sleep(){}

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String toString() {
        return "ТИП: Птицы.Летающие: "
                + getName() +
                ", возраст: " + getAge() +
                ", среда обитания: " + getHabitat();
    }
}
