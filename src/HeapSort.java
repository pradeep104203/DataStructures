public class HeapSort {


    public void maxheap(int[] arr,int n) {
        int heap_Size = arr.length;

        int largest;

            int left = (2 * n) + 1;
            int right = (2 * n) + 2;

            if (left < heap_Size && arr[left] > arr[n]) {
                largest = left;
            } else {
                largest = n;
            }
            if (right < heap_Size && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest != n) {
                int temp = arr[n];
                arr[n] = arr[largest];
                arr[largest] = temp;
                maxheap(arr, largest);
            }
        }


    public void minheap(int[] arr,int n) {
        int heap_Size = arr.length;

        int smallest;

        int left = (2 * n) + 1;
        int right = (2 * n) + 2;

        if (left < heap_Size && arr[left] < arr[n]) {
            smallest = left;
        } else {
            smallest = n;
        }
        if (right < heap_Size && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != n) {
            int temp = arr[n];
            arr[n] = arr[smallest];
            arr[smallest] = temp;
            minheap(arr, smallest);
        }

    }

    public void heapSort(int[] arr)
    {
        for(int i=(arr.length-1)/2;i>=0;i--)
        {
            maxheap(arr,i);
        }

    }

    public void heapSortMin(int[] arr)
    {
        for(int i=(arr.length-1)/2;i>=0;i--)
        {
            minheap(arr,i);
        }

    }

    public void display(int[] arr)
    {
     for(int i=0;i<arr.length;i++)
     {
         System.out.println(arr[i]);
     }
    }

    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60,70,80,90};
        HeapSort hs=new HeapSort();

        hs.heapSort(arr);
        System.out.println("max heap");
        hs.display(arr);
        hs.heapSortMin(arr);
        System.out.println("min heap");
        hs.display(arr);

       // hs.display(arr);


    }
}
