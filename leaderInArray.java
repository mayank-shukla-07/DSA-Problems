import java.util.ArrayList;
import java.util.Collections;

public class leaderInArray {
    public static ArrayList<Integer> printLeaderOn(int[]arr){
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[n-1]);
        int curr_Lea=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(curr_Lea<=arr[i]){
                ans.add(arr[i]);
                curr_Lea=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void printLeader(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag)System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={7,10,4,3,6,5,2};
        System.out.println(printLeaderOn(arr));
    }
}