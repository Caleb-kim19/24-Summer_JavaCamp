import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main stepA = new Main();
    stepA.a01();
  }
  
  void a01(){
    Age age = new Age();
    Scanner s = new Scanner(System.in);
  	System.out.print("Enter a birth year > ");
  	int birthyear = s.nextInt();
  	age.calAge(birthyear);
  	System.out.println("You are " + age.getAge() + " years old.");
  }
}