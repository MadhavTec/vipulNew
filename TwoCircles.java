import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by vipul pachauri on 28/10/17.
 */
public class TwoCircles {

    public static void main(String[] args) {

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(input.readLine());
            String[] output = new String[n];
            for(int i =0;i<n;i++){
                String[] array = input.readLine().split(" ");
                output[i] = circle(Arrays.stream(array).mapToInt(Integer::parseInt).toArray());
            }
            for(String  str : output){
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String circle(int[] array) {
        int x1 = array[0];
        int y1 = array[1];
        int r1 = array[2];
        int x2 = array[3];
        int y2 = array[4];
        int r2 = array[5];
        int start1 = 0,end1=0,start2 = 0,end2 = 0;

        if(x1==x2 && y1==y2) return "Concentric";

        if(x1 ==0 && x2 ==0){
             start1 = y1 - r1;
             end1 = y1 + r1;
             start2 = y2 - r2;
             end2 = y2 + r2;
        }else if(y1 == 0 && y2 ==0){
                 start1 = x1 - r1;
                 end1 = x1 + r1;
                 start2 = x2 - r2;
                 end2 = x2 + r2;
        }

        if(start1 == start2 || end1 == end2) return "Touching";
        else if((start1 > start2 && end1 > end2) || (start2 > start1 && end2 > end1)) return "Disjoint-outside";
        else if ((start1 < start2 && end1 > end2) || (start2 < start1 && end2 > end1)) return "Disjoint-inside";
        else return "Intersecting";


    }
}
