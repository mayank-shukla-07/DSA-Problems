public class calPower {
    public static int optPow(int x,int n){
        if(n==0)return 1;
        if(n%2==0){
            int smallpow=optPow(x, n/2);
            return smallpow*smallpow;
        }
        else{
            int smallAns=optPow(x, n/2);
            return smallAns*smallAns*x;
        }
    }
    public static int power(int x,int n){
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 0));
        System.out.println(optPow(2, 10));
    }
}
