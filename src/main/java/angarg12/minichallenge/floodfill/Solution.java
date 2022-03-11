package angarg12.minichallenge.floodfill;

/*
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and newColor. You should perform a flood fill on the image starting
from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting
pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels
(also with the same color), and so on. Replace the color of all of the aforementioned pixels with newColor.

Return the modified image after performing the flood fill.

Example 1:
Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]

Example 2:
Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, newColor = 2
Output: [[2,2,2],[2,2,2]]
 */

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        recursion(image, sr, sc, newColor, oldColor);
        return image;
    }

    private void recursion(int[][] image, int row, int col, int newColor, int oldColor) {
        int rows = image.length;
        int cols = image[0].length;

        image[row][col] = newColor;
        if (row + 1 < rows)
        	recursion(image, row + 1, col, newColor, oldColor);
        if (row >= 0)
        	recursion(image, row - 1, col, newColor, oldColor);
        if (col + 1 < cols)
        	recursion(image, row, col + 1, newColor, oldColor);
        if (col >= 0)
        	recursion(image, row, col - 1, newColor, oldColor);
    }
}
