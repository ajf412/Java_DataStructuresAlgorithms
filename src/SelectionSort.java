class SelectionSort {

    public static int[] sortArr(int[] arr){
        int min;
        int target = 0;
        int held;

        for(int i = 0; i < arr.length; i++){
            min = arr[i];
            held = arr[i];

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    target = j;
                }
            }
            arr[i] = min;
            arr[target] = held;
        }

        return arr;
    }
}