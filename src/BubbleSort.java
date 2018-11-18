public class BubbleSort {
    public static int[] sortArr(int[] arr) {
        int tracker = arr.length-1;
        while(tracker > 0){
            for(int i = 0; i < tracker; i++){
                if(arr[i] > arr[i+1]){
                    int hold = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = hold;
                }
            }
            tracker--;
        }
        return arr;
    }
}
