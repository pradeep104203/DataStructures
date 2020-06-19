public class SelectionSort {

    public void selectionsort(int[] arr)
    {
        int temp;
      for (int i=0;i<arr.length-1;i++)
      {
           int j,k;
          for(j=k=i;j<arr.length;j++)
          {
              if(arr[j]<arr[k])
              {

                  k=j;
              }
          }
          temp=arr[k];
          arr[k]=arr[i];
          arr[i]=temp;
      }
    }
    public void display(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
    }

    public static void main(String args[])

    {
        SelectionSort ss=new SelectionSort();
        int[] arr={8,6,2,4,5,9,11,15,1};
        ss.selectionsort(arr);
        ss.display(arr);
    }
}
