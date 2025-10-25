import java.util.Scanner;
public class coding1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();

        int sum = mark1+mark2+mark3+mark4+mark5;
        int avg = sum/5;

        if(avg<35){
            System.out.print("Your avg is "+avg+ "Need extra class");
        }
        else{
            System.out.print("Your avg is "+avg+ "Excellent!!!!!!");
        }
    }
}
