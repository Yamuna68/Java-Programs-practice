import java.util.*;
class PrimeCheck{
  public static void main (String []args){
    int num = 89;
    if(num<1){
      System.out.print("not a prime");
      return;
    }
    boolean isPrime = true;
    for(int i=2 ; i*i<=n ; i++){
      if(num % i == 0){
        isPrime = false;
        break;
      }
    }
    if(isPrime){
      System.out.println(num + "It is prime num");
    }else{
      System.out.println(num + "It is not a prime num ");
    }
  }
  
        
