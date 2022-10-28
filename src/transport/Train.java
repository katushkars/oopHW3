package transport;

public class Train extends Transport {
   public int cost;
    public int time;
    public String startStation;
    public String endStation;
    public int countVagon;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public int getCountVagon() {
        return countVagon;
    }

    public void setCountVagon(int countVagon) {
        this.countVagon = countVagon;
    }


    public Train(String marka, String model, int year, String country, String color, int maxSpeed, int cost, int time, String startStation, String endStation, int countVagon) {
        super(marka, model, year, country, color, maxSpeed);
        if (cost<10){
            this.cost=100;} else{this.cost=cost;
        }
        this.time = time;
        this.startStation=checkTransport(startStation,"информация не найдена");
        this.endStation=checkTransport(endStation,"информация не найдена");
        this.countVagon = countVagon;
    }

    @Override
    public String toString() {
        return "Train{" +
                "marka=" + getMarka() +
                ", model=" + getModel() +
                ", color='" + color + '\'' +
                ", year=" + getYear() +
                ", country=" + getCountry() +
                ", maxSpeed=" + maxSpeed +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                "cost=" + cost +
                ", time=" + time +
                ", countVagon=" + countVagon +
                '}';
    }

    @Override
    public void refill() {
        System.out.println("Заправка дизелем!");
    }
}


