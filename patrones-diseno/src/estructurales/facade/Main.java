package designPatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        IntelligentHouse house = new IntelligentHouse();

        System.out.println(house.enter());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println(house.toString());


        System.out.println(house.out().toString());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println(house.toString());

        System.out.println(house.wakeUp().toString());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println(house.toString());

    }
}
