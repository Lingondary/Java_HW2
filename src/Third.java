public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 0, 3, 4};
        int[] array2 = {2, 1, 2, 0, 5};
        int[] array3 = {0, 1, 2, 3};

        System.out.println(hasAdjacentZeros(array1)); // Вывод: true
        System.out.println(hasAdjacentZeros(array2)); // Вывод: false
        System.out.println(hasAdjacentZeros(array3)); // Вывод: false
    }

    public static boolean hasAdjacentZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
