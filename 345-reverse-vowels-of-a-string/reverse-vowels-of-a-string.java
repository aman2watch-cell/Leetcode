class Solution {
    public String reverseVowels(String s) {
        StringBuilder s1 = new StringBuilder(s);
        int n = s1.length();
        int i = 0;
        int j = n-1;
            while(i<j){

                if((s1.charAt(i)=='a'|| s1.charAt(i)=='A'||s1.charAt(i)=='e'||s1.charAt(i)=='E'||s1.charAt(i)=='i'||s1.charAt(i)=='I'||s1.charAt(i)=='o'||s1.charAt(i)=='O'||s1.charAt(i)=='u'||s1.charAt(i)=='U') &&(s1.charAt(j)=='a'|| s1.charAt(j)=='A'||s1.charAt(j)=='e'||s1.charAt(j)=='E'||s1.charAt(j)=='i'||s1.charAt(j)=='I'||s1.charAt(j)=='o'||s1.charAt(j)=='O'||s1.charAt(j)=='u'||s1.charAt(j)=='U')){
                    char temp  = s1.charAt(i);
                    s1.setCharAt(i,s1.charAt(j));
                    s1.setCharAt(j,temp);
                    i++;
                    j--;


                }
                else if((s1.charAt(i)!='a'&& s1.charAt(i)!='A'&&s1.charAt(i)!='e'&&s1.charAt(i)!='E'&&s1.charAt(i)!='i')&&(s1.charAt(i)!='I'&&s1.charAt(i)!='o'&&s1.charAt(i)!='O'&&s1.charAt(i)!='u'&&s1.charAt(i)!='U')){
                    i++;
                }
                else if((s1.charAt(j)!='a'&& s1.charAt(j)!='A'&&s1.charAt(j)!='e'&&s1.charAt(j)!='E'&&s1.charAt(j)!='i')&&(s1.charAt(j)!='I'&&s1.charAt(j)!='o'&&s1.charAt(j)!='O'&&s1.charAt(j)!='u'&&s1.charAt(j)!='U')){
                    j--;
                }

            }
            return s1.toString();

        
       
        
    }
}