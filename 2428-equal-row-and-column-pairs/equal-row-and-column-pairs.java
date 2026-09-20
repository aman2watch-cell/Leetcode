class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<List<Integer>, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {


            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < n; j++) {

                row.add(grid[i][j]);

            }

            map.put(row, map.getOrDefault(row, 0) + 1);
        }



        int answer = 0;

        for(int j = 0; j < n; j++) {

            List<Integer> column = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                column.add(grid[i][j]);
            }

            if(map.containsKey(column)) {
                answer += map.get(column);
            }
        }
        return answer;
    }
}
