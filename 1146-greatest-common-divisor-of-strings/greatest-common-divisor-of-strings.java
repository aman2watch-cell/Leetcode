class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        while(n!=0){
            int remainder = m%n;
            m=n;
            n=remainder;

            
        }
        System.out.println(m);
        
        StringBuilder x= new StringBuilder(m);
        x.append(str1.substring(0,m));
        if(str1.length()%m== 0&&str2.length()%m==0){
            int repeat = str1.length()/m;
            int repeat2 = str2.length()/m;
            StringBuilder s1= new StringBuilder(str1.length());
            StringBuilder s2= new StringBuilder(str2.length());
            for(int i = 0 ; i<repeat;i++){
                 s1.append(x);
                
             
            }
            for(int j =0;j<repeat2;j++){
                s2.append(x);
            }
            
            if(s1.toString().equals(str1)&&s2.toString().equals(str2)){

                return x.toString();
            }else{
                return "";
            }
        }else{
            return "";
        }

        
    }
}