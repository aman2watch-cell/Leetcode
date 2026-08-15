class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int previous;
        int current;
        int next;
        int m = flowerbed.length;
        if (n==0){
            return true;
        }
        
        for(int i = 0; i<=m-1;i++){
            if(m==1){
                previous = 0;
                current = flowerbed[0];
                next = 0;
                
            }
            else if(i == 0){
                 previous = 0;
                 current = flowerbed[0];
                 next = flowerbed[1];
            }else if(i==m-1){
                 previous = flowerbed[m-2];
                 current = flowerbed[m-1];
                 next = 0;

            }
            else{
                previous = flowerbed[i-1];
                current = flowerbed[i];
                next = flowerbed[i+1];
            }
            if(previous == 0 && next == 0 && current == 0){
                flowerbed[i] = 1;
                n--;
                if(n== 0 ){
                    return true;
                }else{
                    i++;
                }
            }
        }
        return false ;
    }
}
