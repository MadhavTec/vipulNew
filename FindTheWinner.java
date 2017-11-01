import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vipul pachauri on 27/10/17.
 */
public class FindTheWinner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] andreaArray = new int[n1];
        for(int i =0;i<n1;i++){
            andreaArray[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] mariaArray = new int[n2];
        for(int i =0;i<n2;i++){
            mariaArray[i] = sc.nextInt();
        }

        String value = sc.next();

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for (int i = 0;i< n1;i++){
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }


        int andreaSum = 0;
        int mariaSum = 0;

        if ("Even".equals(value)){
            for (Integer i:evenList) {
                andreaSum += andreaArray[i] - mariaArray[i];
                mariaSum += mariaArray[i] - andreaArray[i];
            }
        }else {
            for (Integer i:oddList) {
                andreaSum += andreaArray[i] - mariaArray[i];
                mariaSum += mariaArray[i] - andreaArray[i];
            }
        }

        if(andreaSum > mariaSum){
            System.out.println("Andrea");
        }else{
            System.out.println("Maria");
        }

    }
}
