public class QuickSort {

   public  int partitions(int arr[],int start,int end)
    {
        int i=start-1;
        int x=arr[end];
        for(int j=start;j<=end-1;j++) {
            if (arr[j] < x) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
            int temp1 = arr[i + 1];
             arr[i + 1]=arr[end];
             arr[end] = temp1;

        return i + 1;
    }


    public void display(int arr[])
    {
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
    }

    public void quickSort(int arr[],int start,int end)
    {
        if(start<end) {

            int q = partitions(arr,start,end);
            quickSort(arr,start,q-1);
            quickSort(arr,q+1,end);
        }

    }
    public static void main(String args[])
    {
        QuickSort qs=new QuickSort();
        int[] arr={1,2,3,3,4,5,7,7,9,2,8};
        int n=arr.length;
        qs.quickSort(arr,0,n-1);
        qs.display(arr);
    }
}
