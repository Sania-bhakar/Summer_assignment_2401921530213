package week1.day4;
import java.util.*;
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow  = matrix.length - 1;
        int endCol = matrix[0] - 1;

        while(startRow <= endRow && startCol <= endCol){
          for(int i=startRow; i<endCol; i++){
            System.out.print( matrix[startRow][j] +" ")
           }
        }
    }
}