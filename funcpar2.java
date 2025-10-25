public class funcpar2 {
    void add(int a,int b){
        int sum = a + b;
        System.out.println(sum);
    }
    void mul(int a,int b){
    int product = a * b;
    System.out.println(product);
    }
    void div(int a,int b){
    int div = a / b;
    System.out.println(div);
    }
    void sub(int a,int b){
    int sub = a - b;
    System.out.println(sub);
    }
    public static void main(String[]args){
        funcpar2 fp = new funcpar2();
        fp.add(90,10);
        fp.sub(90,10);
        fp.mul(90,10);
        fp.div(90,10);
    }
}
