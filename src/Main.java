import static javafx.application.Application.launch;

/**
 * Test, PACKAGE_NAME
 * Mario Winiker
 * 31/03/2016
 */
public class Main {
    public static void main(String[] args) {
        HelloWorld.launch(args);
        Pocket<String> stringPocket = new Pocket<>();
        String klaus = "Was zur Hoelle?";
        stringPocket.setValue(klaus);
        int fritz = 2;
        Pocket<Integer> integerPocket = new Pocket<>(fritz);
        System.out.println(stringPocket.getValue());
        System.out.println(integerPocket.getValue());
        int[] hans = {1,2,3,4,5,6,7,8,9};
        for (int n : hans){
            System.out.println(n);
        }
        char[] alphabet = new char[26];
        for (char x : alphabet){
            x = 'c';
        }
        for (char x : alphabet){
            System.out.println(x);
        }
    }
}
