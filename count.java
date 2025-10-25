import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println("Length of the string you gave is "+count);
    }
}
