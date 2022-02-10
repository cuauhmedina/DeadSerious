public class Main {
    public static void main(String args []){
        System.out.println("This is a Hello world");
        System.out.println("Now we print the number five");
        printNumber(5);
        System.out.println("Now we print a letter ");
        printLetter("a");
    }

    public static void printLetter(String letter){
        System.out.println("This is a the letter " + letter);
    }

    public static void printNumber(int numb){
        System.out.println("this is the number " + numb);
    }
}