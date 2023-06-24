//Task 4b
public class HowManySpacesHere {
    public static void main(String[] args) {

        String str = "All of The Times";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Количество пробелов в предложении: " + count);
    }
}
