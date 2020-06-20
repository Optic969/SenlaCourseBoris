public class ArrayCounter {
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int[] arr) {

        int min=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr11 = {12, 33, 4, 5, 323};
        System.out.println(findMin(arr11));
        System.out.println(findMax(arr11));
    }
}
