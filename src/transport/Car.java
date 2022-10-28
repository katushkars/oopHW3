package transport;

import java.time.LocalDate;
public class Car extends Transport {

    private double volume;
    private String transmission;
    private String bodyType;
    private int numbersOfSeats;
    private String season;
    private String regNumber;
    private  Key key;
    private Insurance insurance;


    public Car(String marka, String model, double volume, String color, int year, String transmission, String bodyType, int numbersOfSeats, String season,String regNumber, int maxSpeed, String country) {
        super(marka, model,year,country, color,maxSpeed);
        this.transmission=checkCar(transmission,"default");
        this.bodyType=checkCar(bodyType,"default");
        this.numbersOfSeats = numbersOfSeats;
        this.season= checkCar(season,"default");;
        if (volume==0){
            this.volume = 1.5;} else {
            this.volume=volume;
        }


        this.regNumber=regNumber;

    }



    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void refill() {
        System.out.println("Заправка бензином или дезилем или зарядка на специальных электропарковках");
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public void setNumbersOfSeats(int numbersOfSeats) {
        this.numbersOfSeats = numbersOfSeats;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void carInfo() {
        System.out.println(getMarka()+" "+getModel()+
                ", сборка "+getCountry()+
                ", цвет кузова - "+getColor()+
                ", объем двигателя - " +getVolume()+
                ", год выпуска - " +getYear()+
                ", коробка передач - " +getTransmission()+
                ", тип кузова - " +getBodyType()+
                ", количество мест - "+getNumbersOfSeats()+
                ", шины - "+getSeason());
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016

    }
    public String checkCar(String value,String defaultValue) {
        if (value == null) {
            return defaultValue;
        } else {
            return value;
        }
    }
    public void newSeason(){
        int nowDate= LocalDate.now().getMonthValue();
        String realSeason;

        if (nowDate<=4 || nowDate>=10) {
            realSeason = "зима";
        }else{realSeason ="лето";}
        if (realSeason.equals(getSeason())){
            System.out.println("Сезон верный!");
        }else{
            System.out.println("Пора менять шины!");
        }
    }
    public boolean checkRegNumber(){
        if (regNumber.length()!=9){
            return false;
        }
        char[] regNumberChar=this.regNumber.toCharArray();
        return isLetter(regNumberChar[0])
                && isLetter(regNumberChar[4])
                && isLetter(regNumberChar[5])
                && isNumber(regNumberChar[1])
                && isNumber(regNumberChar[2])
                && isNumber(regNumberChar[3])
                && isNumber(regNumberChar[6])
                && isNumber(regNumberChar[7])
                && isNumber(regNumberChar[8]);
    }
    private boolean isLetter (char symbol){
        String allRightSymbols = "ABEKMHOPCTYX";
        return allRightSymbols.contains(""+symbol);
    }
    private boolean isNumber (char symbol ){
        return Character.isDigit(symbol);
    }
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }
    public static class Insurance{

        private final LocalDate validUntil;
        private final int cost;
        private final String number;

        public Insurance(LocalDate validUntil, int cost, String number) {
            this.validUntil = validUntil!=null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = cost;
            if (number.length()==9){
                this.number=number;} else{ this.number="default";};

        }

        public boolean isInshuranceValid (){
            return LocalDate.now().isBefore (this.validUntil);
        }

    }

}
