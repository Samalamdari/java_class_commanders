package week_7.lab_session;

public class Runner {

    public static void main(String[] args) {

        var obj = new GettersAndSetters(
                "James",
                20,
                "mm/dd/yyyy"
        );

        var objTwo = new GettersAndSetters(
                "Tony",
                43,
                "mm/dd/yyyy"
        );


        obj.printInfo();
        objTwo.printInfo();

    }

}
