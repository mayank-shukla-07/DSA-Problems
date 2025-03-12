import java.util.Arrays;
import java.util.Scanner;

public class rotatekstepWithotExtraSpace {
    static void rotateInPlace(int[]arr,int k){
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k, n-1);
        reverse(arr, 0, n-1);
    }


    public static int[] reverse(int[]arr,int st,int en){
        while(st<en){
            swap(arr,st,en);
            st++;
            en--;
        }
        return arr;
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements : ");
        int[]arr=new int[size];
        for(int  i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the k value : ");
        int k=sc.nextInt();
        rotateInPlace(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();
        
    }
}
