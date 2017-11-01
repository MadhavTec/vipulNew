import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vipul pachauri on 26/10/17.
 */
public class BalancedOrNot {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int noOfExpression = sc.nextInt();

        String[] expArray = new String[noOfExpression];
        for(int i = 0; i<noOfExpression;i++){
            expArray[i] = sc.next();
        }

        int noOfReplacement = sc.nextInt();
        String[] repArray = new String[noOfReplacement];
        for(int i = 0; i<noOfReplacement;i++){
            repArray[i] = sc.next();
        }

        int[] output = new int[noOfExpression];
        for(int i = 0;i<noOfExpression;i++){
            int isBalanced = isBalancedExpression(expArray[i],repArray,i);
            output[i] = isBalanced;
        }

        System.out.println(Arrays.toString(output));
    }


    private static int isBalancedExpression(String expression, String[] repArray, int count) {
        String[] symbolArray = expression.split("");
        int n1 = 0;
        int n2 = 0;
        for (int i = 0;i<symbolArray.length;i++){
            if("<".equals(symbolArray[i])) n1++;
            else n2++;

        }
        if(n1 == n2) return 1;
        return (Math.abs(n1-n2) <= Integer.parseInt(repArray[count])) ? 1 : 0;

    }
}
