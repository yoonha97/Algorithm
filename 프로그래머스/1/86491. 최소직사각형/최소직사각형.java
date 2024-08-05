class Solution {
    public int solution(int[][] sizes) {
        int maxR = 0;
        int maxC = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            
            maxR = Math.max(maxR, sizes[i][0]);
            maxC = Math.max(maxC, sizes[i][1]);
        }
        
        return maxR * maxC;
    }
}