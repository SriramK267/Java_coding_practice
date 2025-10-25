public class funcpar {
    void getsoap(int price){
        System.out.println(price);
        System.out.println("Bought soap");
    }
    void getchocolate(int price){
        System.out.println(price);
        System.out.println("Bought chocolate");
    }
    void getapple(int price){
        System.out.println(price);
        System.out.println("Bought apple");
    }

    public static void main(String[] args) {
        funcpar fp = new funcpar();
        fp.getsoap(50);
        fp.getchocolate(20);
        fp.getapple(30);
    }
}
