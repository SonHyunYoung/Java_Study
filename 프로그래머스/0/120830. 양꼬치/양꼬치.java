class Solution {
    public int solution(int n, int k) {
        return (n / 10 == k) ? 12000 * n : (12000 * n) + (k - n / 10) * 2000;
    }
}