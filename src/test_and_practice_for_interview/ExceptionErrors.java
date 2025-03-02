package test_and_practice_for_interview;

public class ExceptionErrors {

    public static void main(String[] args) {

        try{
            String[] names = {"Bob", "Jack", "Mike"};
            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);

            System.out.println(names[3]);
            System.out.println(10 / 0);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of range");
            e.printStackTrace();
        } catch (ArithmeticException ae){
            System.out.println("Can not divide by Zero");
            ae.printStackTrace();
        }


        System.out.println("*************************************");

//        ArrayList<String> newListOfNames = new ArrayList<>();
//        newListOfNames.add("David");
//        newListOfNames.add("Sam");
//        newListOfNames.add("John");
//        System.out.println(newListOfNames);



    }
}
