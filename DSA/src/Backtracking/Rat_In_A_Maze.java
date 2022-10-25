package Backtracking;
import java.util.*;

public class Rat_In_A_Maze {
    static int N;
    public static void main(String[] args) {
        int[][] maze = new int[][]{
                {1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}
        };
        N = maze.length;
        printSoln(maze);
    }
    //PRINT SOLUTION
    static void printSoln(int sol[][]){
        for(int i = 0;i<N;i++){
            for (int j = 0; j < N ; j++) {
                System.out.println(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    //BACKTRACKING FUNCTION FOR REDUCE THR RECURSION CALL
    static boolean isSafe(int maze[][],int i ,int j){
        return (i<N && j < N && maze[i][j]==1);
    }



}
