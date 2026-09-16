import java.util.*;
class ReverseString{
  public static void main (String [] args){
    String word = "java";
    String rev = "";
    for (innt i = word.length()-1 ; i>=0 ; i--){
      rev = rev + word.charAt(i);
    }
    System.out.print(rev);
  }
}
    
