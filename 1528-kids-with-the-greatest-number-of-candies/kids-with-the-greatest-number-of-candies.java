class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int x = candies[i] + extraCandies;

            boolean isgreatest = true;

            for (int j = 0; j < n; j++) {

                if (candies[j] > x) {
                    isgreatest = false;
                    break;
                }
            }

            result.add(isgreatest);
        }

        return result;
    }
}