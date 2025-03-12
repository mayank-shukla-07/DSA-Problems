import java.util.HashSet;

public class closestTripletSum {
    public static void findTriplet(int[] arr,int n, int target) {
        for (int i = 0; i < n - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            int currSum = target - arr[i]; 
            
            for (int j = i + 1; j < n; j++) {
                if (set.contains(currSum - arr[j])) {
                    System.out.println(arr[i] + " " + arr[j] + " " + (currSum - arr[j]));
                }
                set.add(arr[j]);
            }
        }
    }
    public static void findClosest(int []arr,int n,int target){
        int min=0;
        int closestsum=0;
        int t1=0;
        int t2=0;
        int t3=0;
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=arr[i]+arr[j]+arr[k];
                    min=Math.abs(target-sum);
                    if(min<mindiff){
                        mindiff=min;
                        closestsum=sum;
                        t1=arr[i];
                        t2=arr[j];
                        t3=arr[k];
                    }
                }
            }
        }
        System.out.println(t1+" "+t2+" "+t3+" "+closestsum);
    }
    public static void main(String[] args) {
        int[]arr={-1,2,1,-4};
        findClosest(arr, 4, 1);
    }
}
