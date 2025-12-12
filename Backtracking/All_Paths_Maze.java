public class All_Paths_Maze {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        pathRestriction("", board, 0, 0);
    }
    static void pathRestriction(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false; // Mark the cell as visited
        if(r < maze.length - 1) {
            pathRestriction(p + "D", maze, r + 1, c);
        }   
        if(c < maze[0].length - 1) {
            pathRestriction(p + "R", maze, r, c + 1);
        }
        if(r > 0) {
            pathRestriction(p + "U", maze, r - 1, c);
        }
        if(c >0){
            pathRestriction(p + "L", maze, r, c - 1);
        }

        // Backtrack: unmark the cell as visited
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[r][c] = true; // Unmark the cell
        // This allows other paths to use this cell again
    }
}
