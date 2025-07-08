public class Sieve {
    public static void main(String[] args) {
       int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    static void sieve(int n, boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                
            }
        }
    }
}
