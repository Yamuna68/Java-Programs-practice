import java.util.*;
class SecondHighest{
  public static void main (String[] args){
    int [] arr = {10,40,80,20,60,69,98};
    int first = Integer.MIN_VALUE;
    int Second = Integer.MIN_VALUE;
    for(int num : arr){
      if(num > first){
        second = first;
        first = num;
      }else if(num >second && num!=first){
        second = num;
      }
    }
    System.out.println("Second largest element is : " + second);
  }
}
}
    
