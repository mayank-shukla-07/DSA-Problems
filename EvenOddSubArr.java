public class EvenOddSubArr {
    public static int longestEvenOdd(int[]arr,int n){
        int count=1;
        int ans=1;
        for(int i=1;i<n;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                count++;
                ans=Math.max(ans,count);
            }
            else{
                count=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={10,1,12,1,0,7,14,16,7,8,5};
        int n=arr.length;
        System.out.println(longestEvenOdd(arr, n));
    }
}