package week_7.day_3.activities;

public class CommandersRunner {

    public static void main(String[] args) {

        Commanders stdOneObj = new Commanders();
        Commanders stdTwoObj = new Commanders();
        Commanders stdThreeObj = new Commanders();

        stdOneObj.firstName = "Shahzad";
        stdOneObj.lastName = "Paktiawal";
        stdOneObj.title = "Student";
        stdOneObj.bootCampName = "TekSchool";
        stdOneObj.timeZone = "EST";

        stdTwoObj.firstName = "Mike";
        stdTwoObj.lastName = "Dakwa";
        stdTwoObj.title = "Student";
        stdTwoObj.bootCampName = "TekSchool";
        stdTwoObj.timeZone = "EST";


        stdOneObj.printStudentInfo();
        stdTwoObj.printStudentInfo();

        stdOneObj.printRegisteredStudents();
        stdTwoObj.printRegisteredStudents();


    }
}
