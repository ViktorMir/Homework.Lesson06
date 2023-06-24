//Task 1
public class RepetingElemets {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7};

        for ( int i = 0; i < Array.length; ++i){
            for ( int j = i +1; j < Array.length; j++){
                if((Array[i]==(Array[j])) && (i !=j)){
                    System.out.println("Повторяющийся элемент : "+Array[i]);
                }
                else if (Array[i]!=Array[j]) {
                    System.out.println("Повторяющихся элементов нет" );
                }
            }
        }
    }
}
