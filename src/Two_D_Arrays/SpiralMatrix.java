package Two_D_Arrays;

public class SpiralMatrix {
    static void spiralMatrix(int[][] matrix)
    {
        int n = matrix.length;
        int startRow = 0;
        int startCol = 0;
        int endRow = n-1;
        int endCol = n-1;
      while(startRow <= endRow && startCol <= endCol) {
          for (int i = startCol; i <= endCol; i++) {
              System.out.print(matrix[startRow][i] + " ");
          }
           startRow++;
          for (int i = startRow; i <= endRow; i++) {
              System.out.print(matrix[i][endCol] + " ");
          }
          endCol--;
          if(startRow<=endRow)
          {
              for (int i = endCol; i >= startCol; i--) {
                  System.out.print(matrix[endRow][i] + " ");
              }
              endRow--;
          }
          if(startCol<=endCol)
          {
              for (int i = endRow ; i >= startRow; i--) {
                  System.out.print(matrix[i][startRow] + " ");
              }
              startCol++;
          }
      }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {12,13,14,5},
                          {11,16,15,6},
                          {10,9,8,7}};
        spiralMatrix(matrix);
    }
}
