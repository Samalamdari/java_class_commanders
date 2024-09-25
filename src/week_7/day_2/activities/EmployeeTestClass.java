package week_7.day_2.activities;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeTestClass {

    public static void main(String[] args) {

        ArrayList<EmployeeInfo> listOfEmployees = new ArrayList<>(Arrays.asList(
                new EmployeeInfo(1, "Tony Morphy", "mm/dd/yyyy"),
                new EmployeeInfo(2, "James Goslin", "mm/dd/yyyy"),
                new EmployeeInfo(3, "Trevor Kubaki", "mm/dd/yyyy")
        ));

//        listOfEmployees.add(
//          new EmployeeInfo(1, "Tony Morphy", "mm/dd/yyyy"),
//        );

//        listOfEmployees.addAll(Arrays.asList(
//                new EmployeeInfo(1, "Tony Morphy", "mm/dd/yyyy"),
//                new EmployeeInfo(2, "James Goslin", "mm/dd/yyyy"),
//                new EmployeeInfo(3, "Trevor Kubaki", "mm/dd/yyyy")
//        ));

//        System.out.println( listOfEmployees ); // This will print the reference of each object

        for ( EmployeeInfo obj : listOfEmployees ) {
            obj.printEmployeeInfo();
        }

    }

}
