import animals.*;
import transport.Bus;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 0, "Москва.Белорусский вокзал", "Минск", 11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700, 0, "Москва.Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(train1.toString());
        Bus bus1 = new Bus("Икарус", "И1", 2000, "Россия", "белый", 60);
        Bus bus2 = new Bus("МЯумяус", "М2", 2020, "Россия", "зеленый", 60);
        Bus bus3 = new Bus("Газель", "Баргузин", 2022, "Япония", "желтый", 60);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
        bus2.refill();

        Herbivores herbivores1 = new Herbivores("Лошадь", 20, "земля", 60, "трава");
        Amphibians amphibians1 = new Amphibians("Лягушка", 2, "земля и вода");
        Amphibians amphibians2 = new Amphibians("Уж пресноводный", 2, "земля и вода");
        Herbivores herbivores2 = new Herbivores("Жираф", 20, "земля", 60, "трава");
        Herbivores herbivores3 = new Herbivores("Газель", 20, "земля", 60, "трава");
        Predator predator1=new Predator("Гиена", 12, "земля", 60, "мясо");
        Predator predator2=new Predator("Тигр", 6, "земля", 60, "мясо");
        Predator predator3=new Predator("Медведь", 4, "земля", 60, "мясо");
        Flightless flightless1 =new Flightless("Павлин", 5, "земля");
        Flightless flightless2 =new Flightless("Пингвин", 2, "земля");
        Flightless flightless3 =new Flightless("Птица додо", 5, "земля");
        Flying flying1=new Flying("Чайка", 10, "воздух");
        Flying flying2=new Flying("Альбатрос", 2, "воздух");
        Flying flying3=new Flying("Сокол", 1, "воздух");

        System.out.println(herbivores1.toString());
        herbivores1.eat();
        System.out.println(herbivores2.toString());
        System.out.println(herbivores3.toString());
        System.out.println(amphibians1.toString());
        System.out.println(predator1.toString());
        System.out.println(predator2.toString());
        System.out.println(predator3.toString());
        System.out.println(flightless1.toString());
        System.out.println(flightless2.toString());
        System.out.println(flightless3.toString());
        System.out.println(flying1.toString());
        System.out.println(flying2.toString());
        System.out.println(flying3.toString());
    }
}