import java.util.Scanner;

/**
 * Created by Owl on 18.10.15.
 */
public class FromStringToInt {
    public static void main(String[] args){
        String st;
        int stToInt;
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();
        if (st != null && st != "") {
            stToInt = parseInt(st);
            System.out.println(stToInt);
        }
    }

    private static int parseInt(String st){
        int lnSt =st.length();
        int intFormSt = 0;
        int x;

        for (int i = 0; i < lnSt ; i++){
            x = Character.getNumericValue(st.charAt(i));
            intFormSt +=  getPower(lnSt-i)*x;
        }
        return intFormSt;
    }
    private static int getPower(int pow){
        int value = 1;
        for (int i = 1; i < pow; i++) {
            value *= 10;
        }
        return value;
    }
}
