package test_and_practice_for_interview.object_oriented_programing_oop;

public class WorkWithObjectOrientedPrograming {

    public static void main(String[] args) {

        Car carObj = new Car();
        Employee empObj = new Employee();
        Employee empObj2 = new Employee();


        carObj.name = "Tundra";
        carObj.company = "toyota";
        carObj.model = "TRD";
        carObj.year = 2024;

        carObj.printCarInfo();

        System.out.println("******   ******   ******   ******   ******   ******  ******");

        empObj.firstName = "Troy";
        empObj.lastName = "Alexander";
        empObj.salary = 35_000;
        empObj.age = 25;
        empObj.phoneNumber = "222_222_1234";

        empObj.printEmpInfo();

        System.out.println("******   ******   ******   ******   ******   ******  ******");

        empObj2.firstName = "Bob";
        empObj2.lastName = "Morphey";
        empObj2.salary = 116_000;
        empObj2.age = 43;
        empObj2.phoneNumber = "333_222_1234";

        empObj2.printEmpInfo();



    }
}
