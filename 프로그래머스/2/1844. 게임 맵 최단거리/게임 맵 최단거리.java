import java.util.*;

class Solution {
    static int[] dr = { 0, 1, 0, -1 };
    static int[] dc = { 1, 0, -1, 0 };
    
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];
        BFS(maps, visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public static void BFS(int[][] maps, int[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = 1;
        
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int R = pos[0];
            int C = pos[1];
            
            for(int dir = 0; dir < 4; dir++){
                int nR = R + dr[dir];
                int nC = C + dc[dir];
                
                if(nR >= 0 && nR < maps.length && nC >= 0 && nC < maps[0].length && maps[nR][nC] == 1 && visited[nR][nC] == 0) {
                    q.offer(new int[]{nR, nC});
                    visited[nR][nC] = visited[R][C] + 1;
                }
            }
        }
    }
}