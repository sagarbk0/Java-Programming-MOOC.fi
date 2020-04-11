
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=1;i<=number;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i=1;i<=number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for(int i=1;i<size;i++){
            printSpaces(size-i);
            printStars(i);
        }
        printStars(size);
    }

    public static void christmasTree(int height) {
        for(int i=0;i<height;i++){
            printSpaces(height-i-1);
            printStars(2*i+1);
        }
        for(int i=0;i<2;i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(3);
        System.out.println("---");
        christmasTree(7);
        System.out.println("---");
        christmasTree(10);
    }
}
