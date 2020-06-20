public class MergeSort {

    public void merge(int[] arr,int start,int mid,int end)
    {

        int n1 = mid - start + 1;
        int n2 = end - mid;


        int Left[]=new int[n1];
        int Right[]=new int[n2];

      for(int i=0;i< n1 ; ++i)
      {
          Left[i]=arr[start+i];

       }

        for(int j=0;j< n2; ++j)
        {
           Right[j]=arr[mid+1+j];

        }

         int i=0;int j=0;
         int k=start;
          while(i < n1 && j < n2 )
          {
           if(Left[i] <= Right[j])
           {
               arr[k]=Left[i];
               i++;
           }
           else
           {
              arr[k]=Right[j];
               j++;
           }
              k++;
       }

        while (i < n1)
        {
            arr[k] = Left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = Right[j];
            j++;
            k++;
        }

    }

    public void mergeSort(int[] arr,int start,int end) {
        if (start < end)
        {
            int mid = (start + end)/ 2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public void display(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
           System.out.println(arr[i]);
        }
    }


    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort ms=new MergeSort();


        ms.mergeSort(arr,0,arr.length-1);
        ms.display(arr);
    }


}
