class Solution {
    public int sumOfPrimesInRange(int n) {
        StringBuilder a = new StringBuilder();
        int b = n;

        while (b != 0) {
            int digit = b % 10;
            a.append(digit);
            b = b / 10;
        }

        int sum = 0;
        int an = Integer.parseInt(a.toString());

        int m = Math.min(n, an);
        int na = Math.max(n, an);

        for (int i = m; i <= na; i++) {
            int count = 0;

            if (i < 2) {
                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }
}