package Day4.Day5.Day6.Day7;
class Student{
    
    String name;
    int age;
    public void display(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class Obj {
    public static void main(String[] args){
        Student Student1=new Student();
        Student1.name="jhon";
        Student1.age=20;
        Student1.display();
        }
}

