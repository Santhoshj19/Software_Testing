import static org.junit. Assert.assertEquals:

import java.util.Scanner;

public class third {

public static void main(String[] args) {

Scanner in new Scanner(System.in);

System.out.println("enter the user name");

String str1 in.nextLine();

System.out.println("Reenter the user name");

String str2 in.nextLine();

assertEquals(str1,str2);

}
}
