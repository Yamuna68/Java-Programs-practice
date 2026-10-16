import java.util.*;
class ArmstrongNum{
    public static void main(String[] args) {
        int num = 1530;
        int orgnum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num>0){
            int digit = num % 10;
            sum = sum + (int) Math.pow(digit, digits);
            num=num/10;
            
        }
     if(sum==orgnum){
         System.out.print("It is Armstrong num");
     }else{
         System.out.print(("It is not armstrong num"));
     }
    }
}
