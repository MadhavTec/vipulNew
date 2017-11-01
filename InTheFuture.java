import java.util.Scanner;

/**
 * Created by vipul pachauri on 28/10/17.
 */
public class InTheFuture {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(findDay(a,k,p));



    }

    private static int findDay(int a, int k, int p) {
        if(a >= k){
            return -1;
        }
        int d = 1;
        int tempA = a+p;
        int tempK = k;
        if(tempA < k){
            return d;
        }else{
            while (tempA >= tempK){
                tempA += a;
                tempK += k;
                d++;
            }
            return d;
        }
    }
}
