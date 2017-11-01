import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vipul pachauri on 28/10/17.
 */
public class PsychometricTesting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i =0;i<n;i++){
            scores[i] = sc.nextInt();
        }

        int lowerlimit = sc.nextInt();
        int[] llArray = new int[lowerlimit];
        for(int i =0;i<lowerlimit;i++){
            llArray[i] = sc.nextInt();
        }

        int upperlimit = sc.nextInt();
        int[] ulArray = new int[upperlimit];
        for(int i =0;i<upperlimit;i++){
            ulArray[i] = sc.nextInt();
        }

        int[] output = new int[lowerlimit];

        for(int i =0;i<lowerlimit;i++){
            int count = 0;
            for(int j = 0;j<n;j++){
                if(scores[j] >= llArray[i] && scores[j] <= ulArray[i]){
                    count++;
                }
            }
            output[i] = count;
        }

        System.out.println(Arrays.toString(output));
    }
}
