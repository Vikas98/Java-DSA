package Two_D_Arrays;

public class SearchInSortedMatrix {
    static boolean searchInMatrix(int[][] matrix,int key)
    {
        int rows = matrix.length-1;
        int col = 0;
        int i = 0, j=0;

        while (rows>=0 && col<matrix[0].length)
        {
            if(matrix[rows][col]>key)
            {
                rows--;
            } else if (matrix[rows][col]<key) {
                col++;
            }
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        System.out.println(searchInMatrix(matrix,25));
    }
}
