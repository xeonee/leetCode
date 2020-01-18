import java.util.*;
public class FrequencyOfWords {
  public static void main(String[] args) {
    String[] arr = {"john", "johnny", "jackie",
                    "johnny", "john", "jackie",
                    "jamie", "jamie", "john",
                    "johnny", "jamie", "johnny",
                    "john"};

    Map<String, Integer> map = new HashMap<String, Integer>();

    for(String str : arr){
      if(map.containsKey(str)){
        map.put(str, map.get(str) + 1);
      }
      else map.put(str, 1);
    }

    String winner = "";
    int max = 0;
    for(Map.Entry<String, Integer> entry: map.entrySet()){
      String key = entry.getKey();
      int value = entry.getValue();

      if(value > max) {
        max = value;
        winner = key;
      }

      if (value == max && winner.compareTo(key) > 0) {
        winner = key;
      }


    } // end of for loop


    System.out.print(winner);
  }
}
