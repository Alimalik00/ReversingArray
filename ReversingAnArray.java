public class ReversingAnArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int len = arr.length/2;
        int arrLen = arr.length;
        int temp = 0;

        for(int i=0; i< len; i++)
        {
            temp = arr[i];
            arr[i] = arr[arrLen-1-i];
            arr[arrLen-1-i] = temp;
        }

        for(int i=0; i<arrLen; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
