package test_and_practice_for_interview.object_oriented_programing_oop;

public class Student extends GeneralInfo {

    private String className;

    public Student(String firstName, String lastName, String dateOfBirth, int age,String className){
        super(firstName,lastName,dateOfBirth,age);
        this.className = className;
    }
    public void printStudentInfo(){
        super.printGeneralInfo();
        System.out.println("ClassName: " + className);
    }


}
