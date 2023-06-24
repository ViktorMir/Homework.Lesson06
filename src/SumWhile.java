//Task 5
public class SumWhile {
    public static void main(String[] args) {
        int[] Array = {28, 52, 18, 2};
        int Sum = 0;
        for (int i = 0; i < Array.length; i++)
            Sum = Sum + Array[i];
        while (Sum > 0) {
            System.out.println("Sum " + Sum);
        }
    }
}
