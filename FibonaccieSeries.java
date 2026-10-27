import java .util.*;
class Main {
    public static void main(String[] args) {
      int first = 0;
        int second = 1;
        for(int i=0 ; i<8 ; i++){
        
            int next = first + second;
             
            first = second;
            second = next;

            System.out.println(first);
            
        }
     
       
    }
}
