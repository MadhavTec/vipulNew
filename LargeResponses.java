import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by vipul pachauri on 28/10/17.
 */
public class LargeResponses {

    static int  count = 0;
    static int benchMark = 5000;
    static int sum = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputFileName = sc.next();
        String filePath = System.getProperty("user.home");
        String fileName = filePath + "/" + inputFileName + ".txt";
        readFile(fileName);
        String outputFile = filePath + "/" + "bytes_" + inputFileName + ".txt";
        writeFile(outputFile);
    }


    private static void readFile(String fileName) {
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((strLine = br.readLine()) != null) {
                String[] array = strLine.split(" ");
                String bytes = array[array.length - 1];
                if (bytes != null && !bytes.trim().equals("")) {
                    try {
                        int n = Integer.parseInt(bytes);
                        if (n > benchMark) {
                            count++;
                            sum += n;
                        }
                    } catch (NumberFormatException ex) {
                        continue;
                    }

                }
            }
        } catch (IOException e) {
            System.err.println("Unable to find the file Or Read file");
        }
    }


    private static void writeFile(String outputFile) {
        FileWriter fw =  null;
        try{
            fw=new FileWriter(outputFile);
            fw.write(count+"\n"+sum);
            System.out.println("File created successfully");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
