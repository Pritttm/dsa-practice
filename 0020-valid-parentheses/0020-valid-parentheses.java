class Solution {
    public boolean isValid(String s) {

        if(s.length()%2!=0) return false;

        Stack<Character>st= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch==')'){
                if(st.isEmpty() || st.peek()!='(') return false;
                st.pop();
            }
            else if(ch=='}'){
                if(st.isEmpty() || st.peek()!='{') return false;
                st.pop();
            }
            else if(ch==']'){
                if(st.isEmpty() || st.peek()!='[') return false;
                st.pop();
            }
            else st.push(ch);
        }
        return st.isEmpty();
    }
}