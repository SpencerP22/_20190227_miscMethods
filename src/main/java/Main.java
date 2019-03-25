public class Main {
    public static void main(String[] args){ //args is a parameter
        double[] numbers = {3.2, 5.7, 8.6, 3.2, 9.1};
        String[] words = {"Happy", "Cheerful", "Good vibes", "Upbeat"};
        String[] foods = new String[10];
        foods[0] = "banana";
        foods[1] = "pizza";
        foods[2] = "coconut";
        foods[6] = "ice cream";
        print(numbers, numbers.length); //numbers and numbers.length are the arguments
        print(words, words.length);
        print(foods, 10);
        printRecursive(numbers, 0);
        System.out.println("Done.");

    }
    public static void print(double[] list, int n) { //list and n are the parameters
        System.out.printf("-------- %d items --------\n",n);

        for(int i=0; i<n; i++) {
            System.out.printf("[%d] %s\n", i, list[i]);
        }
    }
    public static void print(String[] list, int n) {
        int count = 0;
        for(String item: list) {
            if (item != null) {
                count++;
            }
        }
        System.out.printf("-------- %d items --------\n",count);

        for(String word : list) {
            if(word != null)
                System.out.println(word);
        }
    }
    public static void printRecursive(double[] list, int i){
        if(i != list.length){
            System.out.printf("[%d] %s\n", i, list[i]);
            printRecursive(list, i+1);
        }

    }
}

/*
The Stack Trace is a data structure
FiLo structure: first in, last out

Every time we call a function, there is an activation record, which
contains the function signature, parameters, any local variables created, and the return point.


 */