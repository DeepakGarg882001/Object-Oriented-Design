package Java.ObjectOrientedDesign.Day1;


public class first {

    public static void main(String[] args) {
    System.out.println("Welcome to love Babber Course ");
   
    Human User=new Human();
         User.age=20;
         User.userAge();

    }


}

class Human{
       //States

       int age;
       int weight;
       String Name;


       // Behaviour

       void userAge(){

        System.out.println("hi, Age of User is : "+age);
       }


}
