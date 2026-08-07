import java.util.*;
class HiheghestFrequency{
  public static void main (String[] args){
    String[] str = " Java is easy Jav is easy Java Java";
    String word = str.spilt(" ");
    HaashMap<String, Integer> map = new HashMap<>();
    for(String words : word){
      map.put(word, map.getOrDefault(word, 0)+1);
    }
    String maxword = " ";
    int maxcount = 0;
    for(Map.Entry<String, Integer> entry : map.entrySet()){
      if(entry.getValue()>maxcount){
        maxcount = entry.getValue();
        maxword - entry.getKey();
      }
    System.out.print("Highest frequency word is : " + maxword);
    System.out.print("count is " + maxcount);
    }
  }
}
