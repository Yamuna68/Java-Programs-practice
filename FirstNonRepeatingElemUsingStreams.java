import java.util.*;
class Main {
    public static void main(String[] args) {
        String str = "programming";
        Character result = str.chars()
                    .mapToObj(ch -> (char) ch)
                    .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                    .findFirst()
                    .orElse(null);
        System.out.println(result);
       
    }
}
