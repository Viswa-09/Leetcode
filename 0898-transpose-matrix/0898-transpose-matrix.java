class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr = new int[col][row];

        for (int i = 0; i < row; i++) { // Loop over rows first
            for (int j = 0; j < col; j++) { // Then columns
                arr[j][i] = matrix[i][j]; // Swap indices
            }
        }

        return arr;
    }
}