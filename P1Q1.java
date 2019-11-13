
//*1~42,no repeat.//
//*small to big//
import java.util.*;

/**
 * Q1
 */
public class P1Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int[] sixNum = new int[6];
        int[] userNum = new int[6];
        int count = 0;
        //six number , no repeat//
        for (int i = 0; i < 6; i++) {
            sixNum[i] = ran.nextInt(42) + 1;
            for (int j = 0; j < i;) {
                if (sixNum[j] == sixNum[i]) {
                    sixNum[i] = ran.nextInt(42) + 1;
                    j = 0;
                } else {
                    j++;
                }
            }
        }
        //user input six number//
        for (int i = 0; i < 6; i++) {
            userNum[i] = sc.nextInt();
        }
        //sort sixNum & userNum//
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                int tmp1 = 0;
                int tmp2 = 0;
                if (sixNum[j] < sixNum[i]) {
                    tmp1 = sixNum[i];
                    sixNum[i] = sixNum[j];
                    sixNum[j] = tmp1;
                }
                if (userNum[j] < userNum[i]) {
                    tmp2 = userNum[i];
                    userNum[i] = userNum[j];
                    userNum[j] = tmp2;
                }
            }
        }
        // output all
        for(int i = 0;i<12;i++){
            if(i<6){
                System.out.print(sixNum[i]+"\t");
            }
            else{
                System.out.print(userNum[i-6]+"\t");
            }
            if (i == 5 || i == 11) {
                System.out.println();
            }
        }
            // set prise //
        for(int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++)
            if (sixNum[i] == userNum[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}