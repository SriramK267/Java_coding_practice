import java.util.Scanner;
public class ternaryop {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // boolean rain = sc.nextBoolean();
        // String b = (rain)?"Yes":"No";
        // System.out.print(b);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = (a>b)?"a is greater than b":"b is greater than a";
        System.out.print(result);
    }
    
}
