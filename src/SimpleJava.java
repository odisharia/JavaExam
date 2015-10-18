import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Owl on 18.10.15.
 */
public class SimpleJava {
    public static void main(String[] args) {
        int val = 0;
        int[] arr;
        ArrayList<Integer> DiceList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheiyvanet masivis mniSvnelobebi, \n SHEYVANIS DASASRULEBLAD SHEIYVANET 0 !");

        while (sc.hasNext()) {
            val = sc.nextInt();
            if (val != 0) {
                DiceList.add(val);
            } else break;
        }


        if (DiceList.size() > 0) {
            int[] intArray = buildIntArray(DiceList);
            System.out.println("maqsimaluri mniSvnelobis mimdevrobis sigrdze = "+ getMaxSubsequence(intArray));
        } else {
            System.out.println("sheyvanilia arakoreqtuli monacemebi");
            return;
        }


    }

    public static int[] buildIntArray(ArrayList<Integer> integers) {
        int[] ints = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = iterator.next().intValue();
        }

        return ints;
    }


    public static int getMaxSubsequence(int[] A) {
        int newsum = A[0];
        int max = A[0];
        int tempMax = A[0];
        int count = 1;
        int tempCount = 1;
        for (int i = 0; i+1 < A.length; i++) {
            if (A[i] < A[i+1]) {
                max += A[i+1];
                count++;
            } else {
                if (count > tempCount) {
                    tempMax = max;
                    tempCount = count;

                }
                max = 0;
                count = 0;
                max += A[i+1];
                count++;
            }
//            newsum = Math.max(newsum + A[i], A[i]);
//            max = Math.max(max, newsum);
//            maxi = i;
        }
        if (tempMax > max){
            return tempCount;
        }else return count;
    }
}
