class Solution {
    public int compress(char[] chars) {
        int s=0;

        StringBuilder sb=new StringBuilder();

        while(s<chars.length){

            int f=s;
            int count=0;

            while(f<chars.length && chars[s]==chars[f]){
                count++;
                f++;
            }
            if(count>1){
                sb.append(chars[s]);
                sb.append(count);
            }
            else sb.append(chars[s]);
            s=f;
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}