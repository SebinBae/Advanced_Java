package model;

public class Car {

    private final String model;
    private final Integer year;
    // 2000~ 2025년 사이 자동차만 사용하도록 설정
    public Car(String model, Integer year){
        this.model = model;
        this.year = year;
    }


    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "model.Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
