import java.io.FileWriter;
public class filewrite {
    public static void main(String[] args) {
        try{
            FileWriter f1 = new FileWriter("Textfile.txt",true);
            f1.append("Lets Goooo");
            f1.close();
            System.out.println("Success");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
