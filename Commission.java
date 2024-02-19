package neverfail;
import java.util.Scanner;
public class Commission {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount=scanner.nextInt();
        if(amount>=30001){
            int get=amount*20/100;
            System.out.println("commission rate:"+get);}
        else if(amount>=20001){
            int get=amount*15/100;
            System.out.println("commission rate:"+get);}
        else if(amount>=10001){
            int get=amount*10/100;
            System.out.println("commission rate:"+get);}
        else if(amount>10000 || amount<=10000 ){
            int get=amount*0/100;
            System.out.println("commission rate:"+get);}
        else{System.out.println("amount not in range");}
    }
  
}
