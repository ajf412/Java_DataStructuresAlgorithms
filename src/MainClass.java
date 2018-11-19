class MainClass {
    public static void main(String[] args){
        int[] myArr = {4,9,7,1,3,6,5};

        System.out.println("Starting code.");
        System.out.println(" ");

        // SELECTION SORT
        System.out.println("SELECTION SORT");
        SelectionSort.sortArr(myArr);
        printArr(myArr, "Array Selection Sorted to: ");
        resetArr(myArr);
        System.out.println(" ");

        // LINEAR SEARCH
        System.out.println("LINEAR SEARCH");
        System.out.println("Searching for 6.  " + LinearSearch.searchArr(myArr, 6));
        System.out.println("Searching for 8.  " + LinearSearch.searchArr(myArr, 8));
        System.out.println(" ");

        // BUBBLE SORT
        System.out.println("BUBBLE SORT");
        BubbleSort.sortArr(myArr);
        printArr(myArr, "Array Bubble Sorted to: ");
        resetArr(myArr);
        System.out.println(" ");

        // MERGE SORT
        System.out.println("MERGE SORT");
        myArr = MergeSort.sortArr(myArr);
        printArr(myArr, "Array Merge Sorted to: ");
        resetArr(myArr);
        System.out.println(" ");
    }

    private static void resetArr(int[] arr){
        arr[0]=4;
        arr[1]=9;
        arr[2]=7;
        arr[3]=1;
        arr[4]=3;
        arr[5]=6;
        arr[6]=5;
        System.out.print("Array reset to: ");
        for(int n: arr){
            System.out.print(n);
        }
        System.out.println(" ");
    }

    private static void printArr(int[] arr, String desc) {
        System.out.print(desc);
        for(int n: arr){
            System.out.print(n);
        }
        System.out.println(" ");
    }
}
