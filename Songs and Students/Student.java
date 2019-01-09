

public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    private int grade;
    
    public Student(){
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.grade = 0;
        
        System.out.println("3");
    }
    
    public Student(String firstName, String lastName, int age, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        
        System.out.println("4");
        
    }
    public String toString(){
     
        String output= ("First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nAge: " + this.age + "\nGrade: " + this.grade);
        return output;
        
    }   
}
