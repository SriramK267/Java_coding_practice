import java.util.Scanner;
public class coding2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String signal = sc.nextLine();
    switch(signal){
        case "Green" :
            System.out.print("You can go");
                break; 
        case "Orange" :
            System.out.print("If moving go slow or be ready");
                break;
        case "Red" :
            System.out.print("Stop");
                break; 
        default:
            System.out.print("Not valid"); 
    
    }
    }
}
