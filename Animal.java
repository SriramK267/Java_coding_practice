class animal{
    void makesound(){
        System.out.println("This animal makes sound");
    }
}
class dog extends animal{
    void barks(){
        System.out.println("Dog barks");
    }
}
public class Animal {
    public static void main(String[] args) {
    dog d1 = new dog();
    d1.barks();
    d1.makesound();
}       
    }


