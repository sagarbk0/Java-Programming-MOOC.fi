
public class MainProgram {
    
    public static int smallest(int[] array){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++) {
            if(array[i]<small) {
                small=array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]<small) {
                small=array[i];
                index=i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int small=Integer.MAX_VALUE;
        int index=0;
        for(int i=startIndex;i<table.length;i++) {
            if(table[i]<small) {
                small=table[i];
                index=i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int store = array[index1];
        array[index1]=array[index2];
        array[index2]=store;
    }
    
    public static void sort(int[] array) {
        int i=0;
        int j;
        int k;
        while(i<array.length) {
            System.out.print("[");
            for (k=0;k<array.length-1;k++) {
                System.out.print(array[k]+", ");
            }
            System.out.println(array[k]+"]");
            swap(array, indexOfSmallestFrom(array,i), i);
            System.out.print("[");
            for (k=0;k<array.length-1;k++) {
                System.out.print(array[k]+", ");
            }
            System.out.println(array[k]+"]");
            i=i+1;
        }
    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(numbers);
    }

}
