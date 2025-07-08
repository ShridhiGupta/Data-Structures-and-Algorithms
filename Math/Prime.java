public class Prime{
    public static void main(String[] args) {
        int n = 20;
        for(int i=1;i<=n;i++){
            if(isPrime(i)) System.out.println(i);
        }
    }
    static boolean isPrime(int n){
        if(n<2) return false;
        int i = 2;
        while(i*i <= n){
            if(n%i==0) return false;
            i++;
        }
        return true;
    }
}