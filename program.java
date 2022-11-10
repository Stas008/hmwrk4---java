// быстрая сортировка
public class program {

    public static void main(String[] args) {
        
        
        int[] arr = new int[10];
        int low=0;
        int high = arr.length-1;
        lib.fillRandArray(arr);
        lib.printArr(arr);
        
        lib.quickSort(arr, low, high);
        lib.printArr(arr);
    
    
    }
}