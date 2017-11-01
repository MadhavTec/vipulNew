import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by vipul pachauri on 26/10/17.
 */
public class BuyingShowTickets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0;i<size;i++){
            list.add(sc.nextInt());
        }
        int position = sc.nextInt();
        int element = list.get(position);
        int time = 0;

        while (element != 0){
            int x = list.get(0);
            if(x==element) element--;
            list.remove(0);
            int n = x-1;
            if(n != 0){
                list.add(n);
            }
            time++;
        }
        System.out.println(time);
    }
}
