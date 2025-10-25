class father {
    int money = 2000;
}
class Son extends father{

}
public class Dad{
    public static void main(String[]args){
        Son s1 = new Son();
        System.out.println(s1.money);
    }
}
