class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        String[]st=s.split("");
        String[]tt=t.split("");

        Arrays.sort(st);
        Arrays.sort(tt);
        if(!Arrays.equals(st,tt)) return false;

        return true;
    }
}