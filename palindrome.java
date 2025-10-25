import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        String rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        for(int i = str.length()-1;i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("It is a pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }
    }
}
