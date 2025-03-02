package test_and_practice_for_interview.interview_question_practice_reverse;

public class Config {

    // variable
    private String name;
    private String reversedName;

    // Constructor
    public Config(String name) {
        setName(name);
        setReversedName("");
        reversedName();
    }
    // Getter
    public String getName() {return this.name;}
    public String getReversedName() {return this.reversedName;}
    // Setter
    public void setName(String name) {this.name = name;}
    public void setReversedName(String reversedName) {this.reversedName = reversedName;}

   private String reversedName(){
        for (int index = getName().length() - 1; index >= 0; index--){
//            reversedName = getReversedName() + getName().charAt(index);
//            reversedName += getName().charAt(index);
            setReversedName( getReversedName() + getName().charAt(index));

       }
        return getReversedName();
   }
   public void printReversedName(){
       System.out.println("Original version: " + getName());
       System.out.println("Reversed version: " + getReversedName());
   }
}
