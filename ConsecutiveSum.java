import java.util.Scanner;

/**
 * Created by vipul pachauri on 26/10/17.
 */
public class ConsecutiveSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(consecutiveCount(num));
    }

    private static int consecutiveCount(int num) {
        int first = 1, last = 1;
        int temp = 1;
        int count = 0;

        while (first <= num/2)
        {
            if (temp < num)
            {
                last += 1;
                temp += last;
            }
            else if (temp > num)
            {
                temp -= first;
                first += 1;
            }
            else if (temp == num)
            {
                count++;
                temp -= first;
                first += 1;
            }
        }
        return count;
    }
}
