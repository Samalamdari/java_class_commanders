package test_and_practice_for_interview.interview_question_record;

public record EmployeeRecord(String firstName, String lastName, String title, String address, int age) {
// or we can create custom method
    public void printEmployeeInfo() {
        System.out.println("First Name: " + firstName);  // way 1 directly call it
        System.out.println("First Name: " + firstName());  // way 2 like get method
        System.out.println("Last Name: " + lastName());  // way 2 like get method
        System.out.println("Title: " + title());  // way 2 like get method
        System.out.println("Address: " + address());  // way 2 like get method
        System.out.println("Age: " + age());  // way 2 like get method
    }
}


