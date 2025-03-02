package test_and_practice_for_interview.object_oriented_programing_oop;

public class EmployeeTwo extends GeneralInfo{

    String companyName;

    public EmployeeTwo(String firstName, String lastName, String dateOfBirth, int age,String companyName){
        super(firstName,lastName,dateOfBirth,age);
        this.companyName = companyName;
    }

    public void printEmployeeInfo(){
        super.printGeneralInfo();
        System.out.println("companyName: " + companyName);
    }


}
