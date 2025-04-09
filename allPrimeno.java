import java.util.Arrays;

public class allPrimeno {
    public static void sieveApproach(int n){
        boolean[]arr=new boolean[n+1];
        Arrays.fill(arr, true);
        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
    }
    public static boolean isprime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void printPrimeNumber(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n=10;
        sieveApproach(n);
    }
}
