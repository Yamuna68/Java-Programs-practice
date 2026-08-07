import java.util.*;
public class WordOccurance{
public static void main (String [] args){
String [] str = "Java is easy Java is powerful ";
String words = str.split(" ");
HashMap <String, Integer> map = new HashMap<>();
for(String word : words){
  map.put(word, map.getOrDefault(word,0)+1);
}
for(Map.Entry<String,Integer> entry : map.entrySet()){
System.out.print(entry.getKey() + " " + entry.getVALue());
}
}
}

