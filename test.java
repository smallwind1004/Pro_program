import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        while (n >= 3) {
            int n1 = 0;
            int n2 = 0;
            n1 = n/3;
            System.out.println("n1="+n1);
            n2 = n%3;
            System.out.println("n2="+n2);
            count += n1;
            n = n1 + n2;
        }
        System.out.println(count);
    }
}