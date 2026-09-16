import java.util.*;
class pallindrome{
  public static void main(String [] args){
    String str = "madam";
    String rev = "";
    for(int i=str.length()-1 ; i>=0 ; i--){
      rev = rev + str.charAt(i);
    }
    if(str.equals(rev){
    System.out.println("It is pallindrome");
  }else{
      System.out.println("It is not a pallindrome");
}
  }
  
