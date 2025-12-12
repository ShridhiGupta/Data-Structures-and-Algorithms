import java.util.Arrays;

public class PrintAll_Paths_maze {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step; // Store the step in the path
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false; // Mark the cell as visited
        path[r][c] = step; // Store the step in the path
        if(r < maze.length - 1) {
            allPathPrint(p + "D", maze, r + 1, c, path, step + 1);
        }   
        if(c < maze[0].length - 1) {
            allPathPrint(p + "R", maze, r, c + 1, path, step + 1);
        }
        if(r > 0) {
            allPathPrint(p + "U", maze, r - 1, c, path, step + 1);
        }
        if(c >0){
            allPathPrint(p + "L", maze, r, c - 1, path, step + 1);
        }

        // Backtrack: unmark the cell as visited
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true; // Unmark the cell
        // This allows other paths to use this cell again
        path[r][c] = 0; // Reset the step in the path
    }

}
