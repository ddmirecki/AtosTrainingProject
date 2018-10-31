package builder2;

public class Car {

    private String model;
    private int year;
    private String brand;
    private String color;
    private long id;

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static class Builder{
        private String model;
        private int year;
        private String brand;
        private String color;
        private long id;

        public Builder(long id){
            this.id = id;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }
        public Builder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Car build() {
//            Car car = new Car();
//            car.setModel(model);
//            car.setBrand(brand);
//            car.setYear(year);
//            car.setColor(color);
//            car.setId(id);
//            return car;
            return new Car();
        }
    }
}
