public class BubbleSort {
    public void bubblesort(int[] arr) {
        int temp = 0;
        int n = arr.length-1;

        for (int i = 0; i < n; i++) {
            int swapped = 0;

            for (int j = 0; j < arr.length- i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j + 1] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0)
                break;
        }

    }

        public void display (int[] arr)
        {
         for(int i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]);
         }

        }


        public static void main (String args[])
        {
            BubbleSort bs = new BubbleSort();
            int arr[] = {10, 20,20,30,40};
            bs.bubblesort(arr);
            bs.display(arr);
        }

}
