package LeetQutions;

public class LEET1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int c=0;
        for (int i = 0; i < s1.length(); i++) {
          if(s1.charAt(i)!=s2.charAt(i)) c++;
          if(c>2) return false;
        }
        return true;
    }
}
