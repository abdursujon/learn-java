import java.util.ArrayList;
import java.util.List;

public class Matrix {
    // LeetCode 1260. Shift 2D Grid
    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        // if k = 9, and total 9, this shift the k to index 0 to avoid index out of index
        k = k % total;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++){
            List<Integer> list = new ArrayList<>();
            result.add(list);
            for(int j = 0; j < n; j++){
                // get index of element before shifting
                int index = ((i * n + j) - k + total) % total;
                // add the shifted element to the correct position
                list.add(grid[index / n] [index % n]);
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(shiftGrid(new int[][]{{1,2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
    }
}
