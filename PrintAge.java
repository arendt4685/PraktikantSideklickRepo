import java.util.Scanner;
public class PrintAge {
  public static void main(String args[]) {
   String name;
   System.out.println("Wie lautet dein Nachname?");
   Scanner sc = new Scanner(System.in);
   name = sc.nextLine();
   System.out.println("Hallo " + name);
   sc.close();

  }
}
