import java.util.*;
class SumOfDigits{
    public static void main(String[] args){
    int num = 4567;
    int sum = 0;
    while(num>0){
    sum = sum + num % 10;
    num = num /10;
    }
System.out.print(sum);

    }
}
