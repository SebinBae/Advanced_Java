package four_week_task;

class Configuration{

    // 백엔드 40기 배세빈 4주차 4번 문제 제출입니다.

    // GoF(Gang of Four)의 디자인 패턴에서 소개된 23가지 종류의 패턴중 하나인 싱글톤 패턴을 구현함.
    // 크게 23가지의 패턴은 크게 생성, 구조, 행위 패턴으로 나뉘는데
    // 각각 생성 : 객체의 생성 방식을 다루는 패턴, 구조 : 클래스나 객체를 조합해서 더 큰 구조를 만드는 패턴, // 행위 패턴 : 객체 간의 상호작용과 책임 분배를 다루는 패턴임.
    // 싱글톤은 단 하나의 인스턴스(객체)만 생성하도록 보장하는 디자인 패턴임.
    // 구현방법은 클래스의 생성자를 private으로 선언하여 외부에서 객체를 생성할 수 없게 만들고 정적 메소드를 사용하여 내부에서 생성한 단 하나의 객체만 반환하는 방식을 통해 구현함.
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
