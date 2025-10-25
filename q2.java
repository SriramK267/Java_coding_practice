import java.util.Scanner;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i;
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}