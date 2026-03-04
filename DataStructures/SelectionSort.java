public class SelectionSort {
    public static void sort(int[] x,int start){
        if(start== x.length)return;
        // find the smallest item
        int smallest = findSmallest(x,start);

        // move it to the front
        swap(x, start, smallest);

        // selection sort the rest (using recursion)
       sort(x,start+1);

    }
    public static int findSmallest(int[] x,int start){
        int smallest = start;
        for (int i = start; i < x.length; i += 1) {
            if (x[i] < x[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static void swap(int[] x,int a,int b){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
