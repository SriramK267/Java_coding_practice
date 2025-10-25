import java.util.Scanner;

public class str{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%3 == 0 && number%5 == 0){
            System.out.print("div by 3 and 5");
        }
        else{
            System.out.print("not div by 3 and 5");
        }
    }
}