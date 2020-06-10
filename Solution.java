import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(4);
    arr.add(4);
    arr.add(4);
    arr.add(5);
    arr.add(3);

    int ans = migratoryBirds(arr);
    System.out.println(ans);
  }

  static int migratoryBirds(List<Integer> arr) {
    HashMap<Integer, Integer> freqs = new HashMap<>();

    for (int i=0; i<arr.size(); i++) {
      int sightingType = arr.get(i);
      int numSightings = freqs.containsKey(sightingType) ? freqs.get(sightingType) : 0;
      
      freqs.put(sightingType, ++numSightings);
    }

    return mostFreqKey(freqs);
  }

  static int mostFreqKey(HashMap<Integer, Integer> m) {
    int maxKey = (int)m.keySet().toArray()[0];
    for (int i : m.keySet())
      if (m.get(i) > m.get(maxKey))
        maxKey = i;
    return maxKey;
  }
}