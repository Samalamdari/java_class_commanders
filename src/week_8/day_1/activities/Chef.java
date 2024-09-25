package week_8.day_1.activities;

public class Chef {

    String chefName;
    static int numberOfYears;
    static String resturantName;

    public static void main(String[] args) {

        System.out.println( numberOfYears );

    }

    public void printChefName() {
        System.out.println( chefName );
    }

    public void printRestruantName() {
        Chef obj = new Chef();
        System.out.println( obj.resturantName );
    }

}
