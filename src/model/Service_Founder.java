package model;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service_Founder {

    public static void main(String[] args){
        Service service = new Service();

        int service_method_numbers = Service.class.getDeclaredMethods().length;
        Method[] service_method = Service.class.getDeclaredMethods();

        List<Parameter[]> parameters = new ArrayList<>();

        for(int i = 0; i < service_method.length; i++){
            System.out.print(service_method[i] + " ");
            parameters.add(service_method[i].getParameters());
        }

        for(int j = 0; j< parameters.size(); j++){
            System.out.print(parameters + " ");
        }


    }


    }

    class show_parameters {
    private final int method_numbers ;
    private final Method[] methods;
    private final List<Parameter[]> parameters;

    public show_parameters(int method_numbers, Method[] methods, List<Parameter[]> parameters){
        this.method_numbers = method_numbers;
        this.methods = methods;
        this.parameters = parameters;
    }

    public void show_parameters_real(){

    }


    }
