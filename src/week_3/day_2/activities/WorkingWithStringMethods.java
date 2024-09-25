package week_3.day_2.activities;

public class WorkingWithStringMethods {

    public static void main(String[] args) {


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        String cityName = "Virginia";

        System.out.println( "Original value: " + cityName );

        cityName = "FloridaFFFFFFF";

        System.out.println( "Modified value: " + cityName );

        cityName =  cityName.replace('F', 'f'); // F --> florida

        System.out.println( cityName );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        System.out.println( "Hello WORLD".replace('O', 'o') );

        String message = "Hello WORLD";

        message =  message.replace('O', 'u');

        System.out.println( message );

        message =  message.replace('u', 'O');

        System.out.println( message );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        System.out.println( message.replace("WORLD", "world") );

        System.out.println( message );

        message = message.replace("WORLD", "world");

        System.out.println( message );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        // How to remove spaces in a String?
        String welcomeMessage = "Welcome Commanders to the class of JAVA!";

        System.out.println( welcomeMessage );

        System.out.println( welcomeMessage.replace(" ", "") );

        welcomeMessage =  welcomeMessage.replace(" ", "");

        System.out.println( welcomeMessage );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        String commandersClass = "Hello hello hello Hello";

        System.out.println( commandersClass.replace("hello", "commanders!") );

        System.out.println( commandersClass.replaceFirst("hello", "Commanders!") );

        System.out.println( commandersClass.replaceAll("Hello", "JAVA!") );

        System.out.println( commandersClass );

        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        System.out.println( "Java is easy!");
        System.out.println( "Java is easy!".toLowerCase() );
        System.out.println( "Java is easy!".toUpperCase() );

        String secondMessage = "Hello Humans!";

        System.out.println( secondMessage );

        secondMessage = secondMessage.toLowerCase();

        System.out.println( secondMessage );

        secondMessage = secondMessage.toUpperCase();

        System.out.println( secondMessage );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        String email = "                email@gmail.com                                        ";

        System.out.println( email );

        System.out.println( email.trim() );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        String value = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry'" +
                " standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type" +
                " specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially " +
                "unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently " +
                "with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";



        System.out.println( value.contains("industry") ); // true

        System.out.println( value.contains("commanders") ); // false

        System.out.println( value.contains("Industry") ); // false

        // Change all occurrences of industry to Industry and call the contains method in order to get the result.

        System.out.println( value.replaceAll("industry", "Industry").contains("Industry") );

        value = value.replaceAll("industry", "Industry");

        System.out.println( value.contains("Industry") );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        System.out.println( 10 == 10 ); // true
        System.out.println( 50 == 5 ); // false

        System.out.println( 50 != 5  ); // true
        System.out.println( 50 != 50 ); // false

        System.out.println( "Hello" == "Hello" );
        System.out.println( "Hello" == "hello" );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );

        String firstName = "Bob";
        String lastName = "Bob";

        System.out.println( firstName.hashCode() ); // 66965
        System.out.println( lastName.hashCode() ); // 66965

        System.out.println( firstName == lastName ); // true


        String str = new String("Hello");
        String strTwo = new String("hello");

        System.out.println( str.equals(strTwo) );

        System.out.println( str.hashCode() ); // 69609650
        System.out.println( strTwo.hashCode() ); // 99162322

        System.out.println( str == strTwo );
        System.out.println( str.equals(strTwo) );

        firstName = "trevor";
        lastName = "Erin";


        System.out.println( firstName.hashCode() );


        System.out.println( "Hello".equals("Hello") );

        System.out.println( firstName.equals(lastName) );


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );


        String className = "Commanders";

        System.out.println( className.charAt(0) );

        char firstCharacter = className.charAt(0); // C


        System.out.println( " * * * * *  * * * * *  * * * * *  * * * * *  " );




    }

}
