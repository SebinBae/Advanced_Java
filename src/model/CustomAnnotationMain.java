package model;

public class CustomAnnotationMain {

    public static void main(String[] args){

        Car car = CarFactory.createCar(new CarRequest("Chevrolet orlando", 2026));
        System.out.println(car);
    }

}

