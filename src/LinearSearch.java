public class LinearSearch {
    public static String searchArr(int[] arr, int num){
        for(int i= 0; i < arr.length; i++) {
            if (arr[i] == num) {
                String found = "The number " + num + " is found at index " + i;
                return found;
            }
        }

        return "The search criteria is not present in this array.";
    }
}
