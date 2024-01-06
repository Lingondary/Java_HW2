public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 7, 3, 9, 5};
        int[] array2 = {4, 2, 10, 6};

        System.out.println(findDifference(array1)); // Вывод: 8
        System.out.println(findDifference(array2)); // Вывод: 8
    }

    public static int findDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Находим минимальный и максимальный элементы в массиве
        for (int num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        // Возвращаем разницу между максимальным и минимальным элементами
        return max - min;
    }
}
