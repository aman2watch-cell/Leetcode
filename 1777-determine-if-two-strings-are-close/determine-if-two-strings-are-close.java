class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word1.length(); i++) {
            if(map.containsKey(word1.charAt(i))) {
                map.put(word1.charAt(i), map.get(word1.charAt(i)) + 1);
            } else {
                map.put(word1.charAt(i), 1);
            }
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < word2.length(); i++) {
            if(map2.containsKey(word2.charAt(i))) {
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            } else {
                map2.put(word2.charAt(i), 1);
            }
        }
        if(!map.keySet().equals(map2.keySet())) {
            return false;
        }
        ArrayList<Integer> list1 = new ArrayList<>();

        for(int x : map.values()) {
            list1.add(x);
        }
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int x : map2.values()) {
            list2.add(x);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(!list1.equals(list2)) {
            return false;
        }

        return true;
    }
}