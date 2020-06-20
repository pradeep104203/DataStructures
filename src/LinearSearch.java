public class LinearSearch {

    public int linearSearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target)

                return i;
        }
            return -1;
        }

    public static void main(String args[])
    {
        LinearSearch ls=new LinearSearch();

        int[] arr={1,2,3,6,5,9};
        int target=9;
        int result=ls.linearSearch(arr,target);
        if(result==-1)
        {
            System.out.println("target not found");
        }
        else
        {
            System.out.println("target  found at index" +result);
        }


    }
}
