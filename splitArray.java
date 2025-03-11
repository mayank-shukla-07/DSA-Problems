public class splitArray {
    public static int Sum(int[]arr,int l,int r){
        int s=0;
        for(int i=l;i<=r;i++){
            s+=arr[i];
        }
        return s;
    }
    public static int bruteForceSplit(int[]arr,int n){
        for(int i=0;i<n;i++){
            if(Sum(arr, 0, i)==Sum(arr, i+1, n-1))return i;
        }
        return -1;
    }
    public static boolean isSplitPossible(int[]arr,int n){
        int []prefix=new int[n];
        int []suffix=new int[n];
        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=arr[i]+suffix[i+1];
        }
        for(int i=0;i<n-1;i++){
            if(prefix[i]==suffix[i+1])return true;
        }
        return false;
    }
    
    public static int idSplitPosOptimized(int[]arr,int n){
        int totalSum=Sum(arr,0,n-1);
        int prefixsum=0;
        int suffixsum=0;
        for(int i=0;i<n;i++){
            prefixsum+=arr[i];
            suffixsum=totalSum-prefixsum;
            if(prefixsum==suffixsum)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr={3,4,1,6};
        int n=arr.length;
        System.out.println(bruteForceSplit(arr, n));
        if(isSplitPossible(arr, n)){
            System.out.println("Array can be split in two equal sums");
        }
        else{
            System.out.println("Splitation of array not possible");
        }
        System.out.println("at index : "+idSplitPosOptimized(arr, n));
    }
}