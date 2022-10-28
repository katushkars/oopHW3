package transport;

public abstract class  Transport {
    private String marka;
    private String model;
    private int year;
    private String country;
    public String color;
    public int maxSpeed;

    public Transport(String marka, String model, int year, String country, String color, int maxSpeed) {
        this.marka = checkTransport(marka,"default");
        this.model = checkTransport(model,"default");
        this.year = year;
        this.country = checkTransport(country,"default");
        this.color= checkTransport(color,"default");
        this.maxSpeed = maxSpeed;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        checkTransport(color,"defoult");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed ==0) {
            this.maxSpeed=60;} else{
            this.maxSpeed = maxSpeed;
        }
    }
    public String checkTransport (String value,String defoult) {
        if (value == null || value.isBlank()) {
            return defoult;
        } else {
            return value = value;
        }
    }
        public abstract void refill();
        }




