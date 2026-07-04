class Solution {
      public String reverseOnlyLetters(String s) {

        Stack<Character> st = new Stack<>();

        //String to Letter conversion
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) st.add(c);
        }

        //now pop the in reverse order string or char
        StringBuilder b = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) b.append(st.pop());
            else b.append(c);
        }
        return b.toString();

    }
}