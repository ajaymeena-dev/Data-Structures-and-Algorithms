class QuickSort {
    // public static int partition() {
        
    //     return 0;
    // }

    // public static void sortAlgo(int arr[], int low, int high) {
    //     if (high > low) {
    //         int pivIdx = partition();

    //         sortAlgo(arr, low, pivIdx - 1);
    //         sortAlgo(arr, pivIdx + 1, high);
    //     }

    // }

    public static int[] qsort(int arr[],int start,int end){
        if(end-start<=1){
            return arr;
        }

        int pivot=arr[start];
        int lower = start+1;
        int upper = start+1;
        // we will have the partiton as [pivot, lower segment, upper segment]
        // below loop will create this segment as discribed above
        for(int i = start+1; i<=end;i++){

            if(arr[i]>pivot){
                // for every element bigger then the pivot the upper segment grows
                upper++;
            }else{
                // otherwise the element smaller then the pivot is swaped with the starting element of upper segment 
                // and both the lower and upper pointer will moved by one 
                int temp = arr[lower];
                arr[lower]=arr[i];
                arr[i]=temp;
                upper++;
                lower++;
            }
        }
        //moving pivot at right position that is between lower and upper segment
        // this is done by swaping the last element of lower segment with the pivot element 
        int temp=arr[lower-1];
        arr[lower-1]=arr[start];
        arr[start]=temp;



        System.out.println("lower & upper size : "+lower+" "+upper);
        
        for (int i : arr) {
            System.err.print(i+" ");
        }
        System.err.println();


        // now we have one element(pivot) at its correct position 
        // we will do the same thing recursivly with both the lower and upper partition

        qsort(arr,start,lower-2);
        qsort(arr, lower, end);

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 6,19,8, 5, 4, 3, 9, 12,2, 10 };
        int n = arr.length;

        int []result=qsort(arr, 0, n - 1);
        for (int i : result) {
            System.out.print(i+" ");
        }
        
    }
}