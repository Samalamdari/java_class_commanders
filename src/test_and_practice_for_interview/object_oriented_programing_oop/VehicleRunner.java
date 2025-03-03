package test_and_practice_for_interview.object_oriented_programing_oop;

public class VehicleRunner {
    public static void main(String[] args) {

        Vehicle bmw = new Vehicle(
                "Series 3",
                "BMW",
                "M5",
                2025
        );
        Vehicle toyota = new Vehicle(
                "Camry",
                "Toyota",
                "GLX",
                2025
        );

        System.out.println(bmw.toString());
        System.out.println(toyota.toString());
    }
}
