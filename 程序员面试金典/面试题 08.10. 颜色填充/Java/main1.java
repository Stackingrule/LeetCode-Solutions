class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, newColor, oldColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int oldColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] == oldColor && image[sr][sc] != newColor) {
            image[sr][sc] = newColor;
            dfs(image, sr + 1, sc, newColor, oldColor);
            dfs(image, sr - 1, sc, newColor, oldColor);
            dfs(image, sr, sc + 1, newColor, oldColor);
            dfs(image, sr, sc - 1, newColor, oldColor);
        }
    }

}