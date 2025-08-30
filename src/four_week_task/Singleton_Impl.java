package four_week_task;

class Configuration{

    private static final Configuration configuration = new Configuration();

    private Configuration(){}

    public static Configuration getSingleton_Configuration(){
        return configuration;
    }

    public void configurations(){
        System.out.println("세팅을 시작합니다!");
    }
}


public class Singleton_Impl {

    public static void main(String[] args){
        Configuration configuration = Configuration.getSingleton_Configuration();
        configuration.configurations();
    }


}
