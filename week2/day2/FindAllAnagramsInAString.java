import java.util.*;

class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        char[] arr = p.toCharArray();
        Arrays.sort(arr);

        String target = new String(arr);

        int k = p.length();

        for(int i = 0; i <= s.length() - k; i++) {

            String sub = s.substring(i, i + k);

            char[] temp = sub.toCharArray();
            Arrays.sort(temp);

            if(target.equals(new String(temp))) {
                ans.add(i);
            }
        }

        return ans;
    }
}