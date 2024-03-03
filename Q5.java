package assignement;
import java.util.Scanner;
public class Q5 {
    int num;
    public static void factorialNumber(int num){
        num=num;
        int i=num-1;
        System.out.print(num);
        for( i=num-1;i>=1;i--){
        System.out.print("*"+i);
        
    }
       
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number You want to factorize");
        int get=in.nextInt();
       factorialNumber(get); 
        
    }
}
