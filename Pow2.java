import java.util.*;

class Pow2{
    static int power(int n){
        if(n==0) return 1;
        return 2*power(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(power(n));
    }
}