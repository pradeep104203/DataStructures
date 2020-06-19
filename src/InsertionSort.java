public class InsertionSort {

    public void insertSort(int arr[])

    {
        int key;
        for(int j=1;j<arr.length;j++)
        {
            key=arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key)
            {
                arr[i+1]=arr[i];
                i=i-1;
            }
            arr[i+1]=key;
        }

    }
    public void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[])
    {
        InsertionSort is=new InsertionSort();
        int arr[]={5,6,9,4,3};
        is.insertSort(arr);
        is.display(arr);
    }
}
