import java.util.Scanner;

//*string to gnirts XDD//
//*for two ways//
/**
 * P1Q3
 */
public class P1Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}