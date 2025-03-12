public class equilibrium {
    public static int indexeq(int []arr,int n){
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
        for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i])return i;
        }     
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,1,1,1,1,1,5};
        int n=arr.length;
        System.out.println(indexeq(arr, n));
    }
}
