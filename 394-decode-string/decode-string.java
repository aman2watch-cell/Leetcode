
class Solution {
    public String decodeString(String s) {

        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {

                number = number * 10 + (ch - '0');

            }
            else if(ch == '[') {

                numberStack.push(number);
                stringStack.push(current.toString());

                number = 0;
                current.setLength(0);
            }
            else if(ch == ']') {

                int repeat = numberStack.pop();
                String previous = stringStack.pop();

                StringBuilder temp = new StringBuilder();

                for(int j = 0; j < repeat; j++) {
                    temp.append(current);
                }

                current = new StringBuilder(previous);
                current.append(temp);
            }

            else {

                current.append(ch);
            }
        }

        return current.toString();
    }
}

