package week_7.day_2.activities;

import java.util.LinkedHashMap;
import java.util.Map;

public class Review {

    public static void main(String[] args) {

        Map<Integer, String> employeeInfo = new LinkedHashMap<>();

        employeeInfo.put(1, "Bob");
        employeeInfo.put(2, "Tony");
        employeeInfo.put(3, "James");

        System.out.println( employeeInfo );

        employeeInfo.put(1, "Trevor");

        System.out.println( employeeInfo );

        employeeInfo.remove(3);

        System.out.println( employeeInfo );

        employeeInfo.remove(2, "Tony");

        System.out.println( employeeInfo );

        employeeInfo.clear();

        System.out.println( employeeInfo );

        System.out.println( employeeInfo.isEmpty() );

        System.out.println( employeeInfo.size() );

        employeeInfo.put(1, "Bob");
        employeeInfo.put(2, "Tony");
        employeeInfo.put(3, "James");

        System.out.println( employeeInfo.get(2) );

        System.out.println( employeeInfo.keySet() );

        System.out.println( employeeInfo.values() );

        System.out.println( employeeInfo.entrySet() );

        for ( Map.Entry<Integer, String> entry : employeeInfo.entrySet() ) {
            System.out.println( entry.getKey() + " = " + entry.getValue() );
        }

        for ( Map.Entry<Integer, String> entry : employeeInfo.entrySet() ) {
            System.out.println( entry );
        }

        employeeInfo.forEach(( k, v ) -> System.out.println( k + " = " + v) );



    }

}
