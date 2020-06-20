public class BinarySearch {
    public int binarySearch(int arr[],int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target)
                return mid;


            if (arr[mid] < target)
                left = mid + 1;


            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        BinarySearch bs=new BinarySearch();

        int[] arr={1,2,3,4,5,6};
        int target=4;

        //int[] arr1={1,9,4,2,6};

        //QuickSort obj=new QuickSort();
        //int[] marray=obj.quickSort(arr1,0,n);

        int result=bs.binarySearch(arr,target);
        if(result==-1)
        {
            System.out.println("target not found");
        }
        else
        {
            System.out.println("target  found at index " +" "+ result);
        }


    }
}
