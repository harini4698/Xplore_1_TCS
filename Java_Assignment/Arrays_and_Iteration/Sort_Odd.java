import java.util.Arrays; 

public class Sort_Odd{

    public static void main(String[] args){

        int[] arr = {111, 77, 88, 44, 32, 11, 13, 25, 44};

        int[] sorted = sortOddValues(arr);

        for(int i = 0; i<sorted.length; i++){
            if(sorted[i] % 2 != 0)
                System.out.print(sorted[i] + " ");
        }
    }

    public static int[] sortOddValues(int[] A){

        Arrays.sort(A);
        return A;
    }
}