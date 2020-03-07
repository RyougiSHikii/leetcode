package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/8/20 23:12
 */
public class Code74 {

    public static void main(String[] args) {
        int arr[][] = {{1}};

        Code74 c = new Code74();
        System.out.println(c.searchMatrix(arr, 1));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int index = matrix.length;
        while (index-- > 0) {
            int end = matrix[index].length - 1;
            if (matrix[index][0] <= target && matrix[index][end] >= target) {
                return binarySearch(matrix[index], target);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int target) {

        int start = 0, end = arr.length;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid;
            } else if (arr[mid] < target) {
                start = mid;
            } else {
                return true;
            }
        }
        if (arr[0] == target)
            return true;
        return false;
    }

}
