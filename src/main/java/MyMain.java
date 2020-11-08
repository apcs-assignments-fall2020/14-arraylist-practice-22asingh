import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int count = 0;
        for (int i : list){
            if (i % 2 != 0){
                count ++;
            }
        }
        return count;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int x : list1){
            for (int y : list2){
                if (x == y){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr){
            list.add(i);
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(countOdd(list1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
        System.out.println(checkDuplicates(list1,list2));
        int[] arr = {10,20,30,40,50};
        System.out.println(convertToArrayList(arr));

    }
}
