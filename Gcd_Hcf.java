import java.util.Scanner;

public class Gcd_Hcf {
    public static int gcdEuc(int x,int y){
        if(y==0)return x;
        return gcdEuc(y,x%y);
    }
    public static int GCD(int x,int y){
        int min=Math.min(x, y);
        for(int i=min;i>=1;i--){
            if(x%i==0 && y%i==0)return i;
        }
        return -1;
    }
    public static int lcm(int x,int y){
        return (x*y)/gcdEuc(x, y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x=sc.nextInt();
        System.out.print("Enter the second number : ");
        int y=sc.nextInt();
        System.out.println("Gcd of "+x+" and "+y+" is : "+GCD(x, y));
        System.out.println("LCM of "+ x+","+y+" is : "+lcm(x, y));
        sc.close();
    }
}
