public class kthbitset {
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1)count++;
            n=n>>1;
        }
        return count;
    }
    public static boolean iskthBitSet(int n,int k){
        n=n>>k-1;
        if((n&1)==1)return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(iskthBitSet(5,3));
        System.out.println(countSetBits(5));
    }
}