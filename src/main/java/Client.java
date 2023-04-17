import component.Component;
import composites.BusinessClass;
import composites.EconomyClass;
import composites.FirstClass;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Component firstClass = new FirstClass();
        System.out.println("Please input number of first class's passengers: ");
        int passengerCount1 = new Scanner(System.in).nextInt();
        for (int i=0; i<passengerCount1; i++){
            firstClass.add();
            if (i==FirstClass.PASSENGER_LIMIT){
                System.out.println("First class passenger limit has been reached(" + FirstClass.PASSENGER_LIMIT + ")");
            }
        }
        Component  businessClass= new BusinessClass();
        System.out.println("Please input number of business class's passengers: ");
        int passengerCount2 = new Scanner(System.in).nextInt();
        for (int i=0; i<passengerCount2; i++){
            businessClass.add();
            if (i==BusinessClass.PASSENGER_LIMIT){
                System.out.println("First class passenger limit has been reached(" + BusinessClass.PASSENGER_LIMIT + ")");
            }
        }
        Component economyClass = new EconomyClass();
        System.out.println("Please input number of business class's passengers: ");
        int passengerCount3 = new Scanner(System.in).nextInt();
        for (int i=0; i<passengerCount3; i++){
            economyClass.add();
            if (i==EconomyClass.PASSENGER_LIMIT){
                System.out.println("First class passenger limit has been reached(" + EconomyClass.PASSENGER_LIMIT + ")");
            }
        }
        economyClass.remove();
    }
}
