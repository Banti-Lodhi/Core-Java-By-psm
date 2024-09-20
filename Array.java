import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    // String[] names = new String[3];
    // names[0] = "Preetam Singh";
    // names[1] = "Sanjay Singh";
    // names[2] = "Pankaj Sir Acadmy";
    // for (int i = 0; i < names.length; i++) {
    // if (names[i] == "Sanjay Singh") {
    // break;
    // }
    // System.out.println(names[i]);
    // }
    // System.out.println(names.length);

    // System.out.println(1 == 3);
    // System.out.println(1 < 2);

    // Data Type Values
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Your name: ");
    String name = scan.next();
    System.out.println(name);

    System.out.println("Enter Your age: ");
    int age = scan.nextInt();
    System.out.println(age);

    System.out.println("Enter Your Weight: ");
    float weigth = scan.nextFloat();
    System.out.println(weigth);

    System.out.println("Enter Your ans: ");
    boolean val = scan.nextBoolean();
    System.out.println(val);

  }
}
