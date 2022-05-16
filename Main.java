package mazeEscaping;

import java.text.DecimalFormat;

/**
 *
 * @author vict-t
 */
public class Main {

    public static void main(String[] args) {
        int sim = 1000000;
        int success = mouseEscapeSimulation(sim);

        DecimalFormat df = new DecimalFormat("#.###");
        double p = (double) success / sim;

        System.out.println("The Monte Carlo simulation result of one million runs: ");
        System.out.println("No. of successful escape: " + success);
        System.out.println("Success Rate P: " + df.format(p));
    }

    public static int mouseEscapeSimulation(int sim) {
        int success = 0;
        int initialCol = 0, initialRow = 0;
        double rand;
        Mouse m1 = new Mouse();
        Maze obj1 = new Maze();

        int col = 0;
        int row = 0;
        for (int i = 1; i < sim; i++) {
            int newMaze[][] = obj1.getMazeArray();
            obj1.resetMaze();
            rand = Math.random();
            
            newMaze[initialRow][initialCol] = 1;
            col = initialRow;
            row = initialCol;
            while (!obj1.successEscape(row, col) && !obj1.isDeadEnd(row, col)) {
                if (rand < 0.2) {
                    if (row > 0 && obj1.isVisited(row - 1, col)) {
                        row--;
                    }
                } else if (rand < 0.4) {
                    if (col > 0 && obj1.isVisited(row, col - 1)) {
                        col--;
                    }
                } else if (rand < 0.7) {
                    if (row < 6 && obj1.isVisited(row + 1, col)) {
                        row++;
                    }
                } else {
                    if (col < 6 && obj1.isVisited(row, col + 1)) {
                        col++;
                    }
                }

                newMaze[row][col] = 1;

                if (obj1.successEscape(row, col)) {
                    success++;
                }
                rand = Math.random();
            }
        }
        return success;
    }
}
