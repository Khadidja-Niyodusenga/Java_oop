package assignement;
import java.util.Scanner;
public class Q2 {
    static int num1;
   static int num2;
    static int sum=0;
     static void calculate(int num1,int num2){
    num1=num1;
    num2=num2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        num1=scanner.nextInt();
        System.out.println("Enter the Second number");
        num2=scanner.nextInt();
        for(int i=num1+1;i<num2;i++){
        sum+=i;
        }
        calculate(num1,num2);
        System.out.println("the sum of number between"+" "+num1+" "+"and"+" "+num2+"="+" "+sum);
        
    }
  
}
