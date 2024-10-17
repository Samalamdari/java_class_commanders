package week_11.day_2.review.abstraction;

public class Runner {

    public static void main(String[] args) {

        Employee employeeOne = new Employee(
                "John",
                "Doe",
                25,
                "Alexandria, VA"
        );

        Employee employeeTwo = new Employee(
                "Tony",
                "Morphy",
                35,
                "Arlington, VA"
        );

        employeeOne.print();
        employeeTwo.print();

        employeeTwo.printCountOfEmployee();



    }

}
