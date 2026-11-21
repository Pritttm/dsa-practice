class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        if(s.length()%2 != 0) return false;

        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(st.isEmpty()||st.peek()!='(') return false;
                else st.pop();
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                else st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty()||st.peek()!='[') return false;
                else st.pop();
            }
            else st.push(ch);
        }
        return st.isEmpty();
    }
}