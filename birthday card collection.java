public class Solution {
    static List<Integer> hackerCards(int[] collection, int d) {
        List<Integer> result = new ArrayList<>();
        int start=0;
        int end=0;
        for(int i=0; i<=collection.size(); i++) {
            if (i==0) 
              start=1; 
                else
                  start=collection.get(i-1) + 1;
            if (i!=collection.size())
              end= collection.get(i);
                else 
                  end = Integer.MAX_VALUE;
            if (d<s)
              break;
            for (int k=start; k<end; k++) {
                if (k<=d) {
                    result.add(k);
                    d-=k;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
