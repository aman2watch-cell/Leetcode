class Solution {

    public boolean isVowel(char c) {
        return c == 'a' || c == 'A' ||
               c == 'e' || c == 'E' ||
               c == 'i' || c == 'I' ||
               c == 'o' || c == 'O' ||
               c == 'u' || c == 'U';
    }

    public String reverseVowels(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int n = s1.length();
        int i = 0;
        int j = n - 1;

        while (i < j) {

            if (isVowel(s1.charAt(i)) && isVowel(s1.charAt(j))) {
                char temp = s1.charAt(i);
                s1.setCharAt(i, s1.charAt(j));
                s1.setCharAt(j, temp);
                i++;
                j--;

            } else if (!isVowel(s1.charAt(i))) {
                i++;

            } else if (!isVowel(s1.charAt(j))) {
                j--;
            }
        }

        return s1.toString();
    }
}