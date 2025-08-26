package validator;

import annotation.YearRange;
import model.CarRequest;

import java.lang.reflect.Field;

public class Validator {
    public static void validateYear(CarRequest carRequest){
        try{
            Field field = carRequest.getClass().getDeclaredField("year");
            field.setAccessible(true);

            YearRange yr = field.getAnnotation(YearRange.class);
            int year = carRequest.getYear();

            if(year < yr.min() || year > yr.max()){
                throw new IllegalArgumentException("Invalid year range");
            }

        } catch (NoSuchFieldException e) {
            throw new RuntimeException("No such field");
        }

    }
}
