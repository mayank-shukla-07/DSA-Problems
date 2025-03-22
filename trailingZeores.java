public class trailingZeores {
    public static int countZero(int fac){
        int count=0;
        for(int i=5;fac/i>=1;i*=5){
            count+=fac/i;
        }
        return count;
    }
    public static void main(String[] args) {
        int fac=500;
        System.out.println(countZero(fac));
    }
}
