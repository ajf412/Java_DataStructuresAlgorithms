class MainClass {
    public static void main(String[] args){
        System.out.println("Starting code.");

        // SELECTION SORT
        int[] lst = {4,9,7,1,3,6,5};
        SelectionSort.sortArr(lst);
        for(int n: lst){
            System.out.println(n);
        }


    }
}
