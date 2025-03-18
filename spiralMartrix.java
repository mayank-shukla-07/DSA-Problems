public class spiralMartrix {
    public static void printSpiral(int[][]arr,int n,int m){
        int topRow=0;
        int bottomRow=n-1;
        int leftColoum=0;
        int rightColoum=m-1;
        int totalElements=0;
        while(totalElements<n*m){
            for(int j=leftColoum;j<=rightColoum && totalElements<n*m;j++){
                System.out.print(arr[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && totalElements<n*m;i++){
                System.out.print(arr[i][rightColoum]+" ");
                totalElements++;
            }
            rightColoum--;
            for(int j=rightColoum;j>=leftColoum && totalElements<n*m;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && totalElements<n*m;i--){
                System.out.print(arr[i][leftColoum]+" ");
                totalElements++;
            }
            leftColoum++;
        }
    }
    public static void main(String[] args) {
        int [][]arr={
            {1,2,3},{4,5,6},{7,8,9}
        };

        printSpiral(arr, 3, 3);
    }
}
