import java.util.*;
public class addArray {
    public static ArrayList<Integer> add(int []arr1,int m,int []arr2,int n){
        ArrayList<Integer>a=new ArrayList<>();
        int x=0;
        int pow=1;
        for(int i=m-1;i>=0;i--){
            x=arr1[i]*pow+x;
            pow*=10;
        }
        int y=0;
        int pow2=1;
        for(int i=n-1;i>=0;i--){
            y=arr2[i]*pow2+y;
            pow2*=10;
        }
        int ans=x+y;
        while(ans!=0){
            int rem=ans%10;
            a.add(rem);
            ans/=10;
        }
        Collections.reverse(a);
        return a;

    }
    public static void main(String[] args) {
        int []arr1={9,9,9};
        int []arr2={9,9,9};
        System.out.println(add(arr1, 3, arr2, 3));
    }
}