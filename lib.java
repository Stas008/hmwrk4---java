import java.util.Random;
public class lib {
    
    public static void printArr (int[] inputArr){
        for (int i=0; i<inputArr.length; i++){
            System.out.print(inputArr[i]+" ");
        }
        System.out.println();
    }
    public static void fillRandArray (int[] inputArr){
        Random rand = new Random();
        for (int i=0; i<inputArr.length; i++){
            inputArr[i]=rand.nextInt(100);

        }
    }
    public static void swapElemnts(int[] inputArr, int i, int j){
        int temp = inputArr[i];
        inputArr[i]=inputArr[j];
        inputArr[j]=temp;
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                swapElemnts(array, i, j);
                i++;
                j--;
            }
    }
        if (low < j)
        quickSort(array, low, j);

    if (high > i)
            quickSort(array, i, high);
    }
        
    
    public static void main(String[] args) {

    
    
    }
    
}
