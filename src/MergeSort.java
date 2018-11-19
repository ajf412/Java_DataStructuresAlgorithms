public class MergeSort {
    public static int[] sortArr(int[] arr) {
        // 4,9,7,1,3,6,5
        printArr(arr, "Incoming arr: ");
        int[] arrLeft;
        int[] arrRight;

        if(arr.length < 2) return arr;
        // Keep splitting groups down until they're duples.
        arrLeft = new int[arr.length / 2];
        if(arr.length%2 == 0){
            arrRight = new int[arr.length/2];
        } else {
            arrRight = new int[arr.length/2+1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                arrLeft[i] = arr[i];
            } else {
                arrRight[i - arr.length / 2] = arr[i];
            }
        }

        printArr(arrLeft, "arrLeft before: ");
        arrLeft = sortArr(arrLeft);
        printArr(arrLeft, "arrLeft after: ");
        printArr(arrRight, "arrRight before: ");
        arrRight = sortArr(arrRight);
        printArr(arrRight, "arrRight after: ");

        return mergeArr(arrLeft, arrRight);
    }

    public static int[] mergeArr(int[] arrLeft, int[] arrRight){
        printArr(arrLeft, "Merge Left: ");
        printArr(arrRight, "Merge Right: ");
        int[] result = new int[arrLeft.length + arrRight.length];
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < arrLeft.length && j < arrRight.length){
            if(arrLeft[i] < arrRight[j]){
                result[index++] = arrLeft[i++];
            } else {
                result[index++] = arrRight[j++];
            }
        }

        //Cleanup left and right.  Leftovers will be only on ONE side, so only one loop will run.
        while(i < arrLeft.length) {
            result[index++] = arrLeft[i++];
        }
        while(j < arrRight.length) {
            result[index++] = arrRight[j++];
        }

        printArr(result, "Merged result: ");
        return result;
    }

    public static int[] splitArr(int[] arr) {

        return arr;
    }

    private static void printArr(int[] arr, String desc) {
        System.out.print(desc);
        for(int n: arr){
            System.out.print(n);
        }
        System.out.println(" ");
    }
}
