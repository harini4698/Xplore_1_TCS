public class Swap_Values{

    public static void main(String[] args){

        int[] arr = {111, 77, 88, 44, 32, 11, 13, 25, 44};

        int l = arr.length;

        int[] swapped = swapValues(arr, l);

        for(int i = 0; i < swapped.length; i++)
            System.out.print(swapped[i] + " ");
    }

    public static int[] swapValues(int[] A, int n){
        
        int size,temp;
        if(n % 2 == 0)
            size = n-2;
        else
            size = n-3;
            
        for(int i = 0; i <= size; i+=2){
            temp = A[i];
            A[i] = A[i+1];
            A[i+1] = temp;
        }    

        return A;
    }
}