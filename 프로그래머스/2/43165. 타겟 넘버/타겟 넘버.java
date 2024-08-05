class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        DFS(0, 0, numbers, target);
        return answer;
    }
    
    public void DFS(int depth, int sum, int[] numbers, int target) {
        if(depth == numbers.length) {
            if(sum == target) {
                answer++;
            }
            return;
        }
        
        DFS(depth + 1, sum + numbers[depth], numbers, target);
        DFS(depth + 1, sum - numbers[depth], numbers, target);
    }
}