public class L477SurroundedRegions {
    //jz gp 2 BFS DFS 1
    /*
     * @param board: board a 2D board containing 'X' and 'O'
     * @return: nothing
     */
     int n,m;
     int No;
    public void surroundedRegions(char[][] board) {
        // write your code here
        n=board.length;
        if(n==0) return;
        m=board[0].length;
        int mark[][] = new int[n][m];
        boolean surrounded[] = new boolean[n*m+1];
        Arrays.fill(surrounded,true);
        No=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'&&mark[i][j]==0){
                    No++;
                    bfs(i,j,board,mark,surrounded);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'&&surrounded[mark[i][j]]){
                    board[i][j]='X';
                }
            }
        }
    }
    
    
    void bfs(int sx,int sy, char[][] board,int[][] mark, boolean[] surrounded){
        int dx[] ={0,1,0,-1};
        int dy[] = {1,0,-1,0};
        
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        qx.add(sx);
        qy.add(sy);
        mark[sx][sy]=No;
        while(!qx.isEmpty()){
            int ox = qx.poll();
            int oy = qy.poll();
            if(ox==0||ox==n-1||oy==0||oy==m-1){
                surrounded[No]=false;
            }
            
            for(int i=0;i<4;i++){
                int nx=ox+dx[i];
                int ny = oy+dy[i];
                if(0<=nx&&nx<n&&0<=ny&&ny<m&&board[nx][ny]=='O'&&mark[nx][ny]==0){
                    mark[nx][ny]=No;
                    qx.add(nx);
                    qy.add(ny);
                }
            }
        }
    }
}
