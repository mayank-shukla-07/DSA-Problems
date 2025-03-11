import java.util.Scanner;

public class prefixSum{
    public static int sum(int[]arr,int l,int r){
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        if(l==0)return prefix[r];
        return prefix[r]-prefix[l-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n=sc.nextInt();
        System.out.println("Enter array elements :");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number of queries :");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter l and r :");
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println("Sum is :"+sum(arr, l, r));
            q--;
        }
        sc.close();
    }
}