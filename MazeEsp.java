import java.util.Random;

public class MazeESP {
        
  int maze[][]
            = {{0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0}};

    public int[][] getMazeArray() {
        return maze;
    }

    public void resetMaze() {
        for (int q = 0; q < 7; q++) {
            for (int p = 0; p < 7; p++) {
                maze[q][p] = 0;
            }
        }
    }

    public boolean successEscape(int col, int row) {
        return (col == 6 && row == 6);
    }
    
    public boolean isVisited(int row, int col) {
        return maze[row][col] == 0;
    }

    public boolean isDeadEnd(int row, int col) {
        boolean left = true, right = true, up = true, down = true;
        //check if the mouse can go each path one by one
        if (row >= 6 || maze[row + 1][col] > 0) {
            left = false;
        }
        if (col >= 6 || maze[row][col + 1] > 0) {
            down = false;
        }
        if (row <= 0 || maze[row - 1][col] > 0) {
            right = false;
        }
        if (col <= 0 || maze[row][col - 1] > 0) {
            up = false;
        }
        
        return (!left && !right && !up && !down);
    }
        
    public double randomDirection() {
        Random r = new Random();
        return r.nextDouble();
    }

    //method for displaying route
    public void Print() {
        for (int q = 0; q < 7; q++) {
            for (int p = 0; p < 7; p++) {
                System.out.print(maze[q][p] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
