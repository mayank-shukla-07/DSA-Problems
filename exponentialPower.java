public class exponentialPower {
    public static int calValue(int x,int n){
        int ans=1;
        while(n!=0){
            if(n%2!=0){
                ans*=x;
            }
            x*=x;
            n/=2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(calValue(2,10));
    }
}
