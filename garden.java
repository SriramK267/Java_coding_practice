public class garden {
    int apple_price = 20;
    int apple_count = 5;

    void total_money(){
        int price;
        price = apple_price * apple_count;
        System.out.println(price);
    }
    public static void main(String[] args) {
        garden gd = new garden();
        gd.total_money();
    }
}
