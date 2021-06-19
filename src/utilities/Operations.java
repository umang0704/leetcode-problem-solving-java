package utilities;

public class Operations {
    /**
     * @param array
     * @param i
     * @param j
     * @return
     */
    public static Integer[] swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;

    }

    /**
     * prints two array
     *
     * @param arr
     */
    public static void printArray(Object[] arr) {
        for (Object i : arr) System.out.print(i + " ");
        System.out.println("");
    }

    /**
     * @param arr
     * @param initialMessage
     */
    public static void printArray(Object[] arr, String initialMessage) {
        System.out.println(initialMessage);
        for (Object i : arr) System.out.print(i + " ");
        System.out.println("");
    }

    /**
     *
     * @param arr
     */
    public static void print2DArray(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+", ");
            }
            System.out.println();
        }

    }
}
