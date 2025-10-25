interface Readable {
    int a = 10;
    void read();

}
interface Writable {
    int b = 20;
    void  write();
    
}
interface Storable {
    int c = 30;
    void store();
}
class file implements Readable,Writable,Storable {
    public void read(){
        System.out.println("Reading success");
    }
    public void write(){
        System.out.println("Write success");
    }
    public void store(){
        System.out.println("Store success");
    }
}

public class multi {
    public static void main(String[] args) {
    file f1 = new file();
    f1.read();
    f1.write();
    f1.store();  
    System.out.println(f1.a+f1.b+f1.c);      
    }

}
