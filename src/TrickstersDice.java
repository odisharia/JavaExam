import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Owl on 18.10.15.
 */
public class TrickstersDice {
    public static void main(String[] args){
        int val;
        ArrayList<Integer> DiceList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Sheiyvanet kamatelis mniSvnelobebi, \n SHEYVANIS DASASRULEBLAD SHEIYVANET 0 !");

        while (sc.hasNext()){
            val = sc.nextInt();
            if (val != 0) {
                DiceList.add(val);
            }else  break;
        }

        if (DiceList.size() > 0) {
            int[] intArray = buildIntArray(DiceList);
            checkTwoPairCategory(intArray);

        }else {
            System.out.println("sheyvanilia arakoreqtuli monacemebi");
            return;
        }

    }

    public static int[] buildIntArray(ArrayList<Integer> integers) {
        int[] ints = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = iterator.next().intValue();
        }

        return ints;
    }

    private static boolean checkTwoPairCategory(int [] dice){
        int countPair = 0;
        for (int i = 0; i < dice.length; i++) {
            countPair = 0;
            for (int j = 0; j < dice.length; j++) {
                if(dice[i] == dice[j]){
                    countPair++;
                }
            }
        }
        if (countPair == 2) {
            return true;
        }return false;
    }
}
