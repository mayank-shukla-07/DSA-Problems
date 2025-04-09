public class DivisorsOfNum {
    public static void printDiv(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void printEff(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=101;
        printEff(n);
    }
}
