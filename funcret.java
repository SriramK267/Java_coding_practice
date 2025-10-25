public class funcret {
    int add(int a,int b){
    int sum = a + b;
    return sum;
    }
    int mul(int a,int b){
    int product = a * b;
    return product;
    }
    int div(int a,int b){
    int div = a / b;
    return div;
    }
    int sub(int a,int b){
    int sub = a - b;
    return sub;
    }
    public static void main(String[]args){
        funcret fp = new funcret();
        int c = fp.add(20,20);
        int d = fp.sub(30,20);
        int e = fp.mul(20,20);
        int f = fp.div(20,2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
