class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> s1 = new Stack<>();

        s1.push(asteroids[0]);

        int i = 1;

        while (i < asteroids.length) {
            if (s1.isEmpty()) {
                s1.push(asteroids[i]);
                i++;
                continue;
            }

            if (asteroids[i] > 0 && s1.peek() > 0) {
                s1.push(asteroids[i]);
                i++;
            }
            else if (asteroids[i] < 0 && s1.peek() < 0) {
                s1.push(asteroids[i]);
                i++;
            }
            else if (asteroids[i] > 0 && s1.peek() < 0) {
                s1.push(asteroids[i]);
                i++;
            }
            else if (asteroids[i] < 0 && s1.peek() > 0) {

                int a = -asteroids[i];
                int b = s1.peek();
                if (a > b) {
                    s1.pop();

                    if (s1.isEmpty()) {
                        s1.push(asteroids[i]);
                        i++;
                    }
                }
                else if (b > a) {
                    i++;
                }
                else {
                    s1.pop();
                    i++;
                }
            }
        }

        int size = s1.size();

        int[] answer = new int[size];

        for (int j = 0; j < size; j++) {
            answer[j] = s1.get(j);
        }

        return answer;
    }
}