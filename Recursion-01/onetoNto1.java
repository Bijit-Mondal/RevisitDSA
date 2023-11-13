public class onetoNto1{
    public static void onetoN(int n){
        if(n == 0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);
    }
    public static void Nto1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        Nto1(n-1);
    }
    public static void main(String[] args){
        onetoN(10);
        Nto1(10);
    }
}
