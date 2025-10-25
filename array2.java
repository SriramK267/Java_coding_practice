import java.util.Scanner;
public class array2{
    public static void main(String[] args) {
        int size,i,position;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        size = sc.nextInt();
        int[] arr = new int[size];

        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        position = size/2;
        System.out.println(arr[position]);
    }
}