//*random 1~100//
//*big min small//
import java.util.*;
/**
 * P1Q2
 */
public class P1Q2 {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] num = new int[3];
        //three number , no repeat//
        for (int i = 0; i < 3; i++) {
            num[i] = ran.nextInt(100) + 1;
            for (int j = 0; j < i;) {
                if (num[j] == num[i]) {
                    num[i] = ran.nextInt(100) + 1;
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        //sort num
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int tmp = 0;
                if (num[j] < num[i]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        //output//
        System.out.println("Biggest : "+num[2]+"\n"+"Smallest : "+num[0]);
    }
}