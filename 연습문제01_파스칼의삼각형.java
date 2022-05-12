// == 나의 풀이 ==
import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    static ArrayList<Integer> recursion1(int numRow, ArrayList<ArrayList<Integer>> allResult) {
        ArrayList<Integer> rowResult = new ArrayList<Integer>();

        if (numRow < 2) {
            for (int i = 0; i <= numRow; i++) {
                rowResult.add(1);
            }
            return rowResult;
        }

        rowResult.add(1);
        for (int i = 1; i < numRow; i++) {
            rowResult.add(allResult.get(numRow - 1).get(i - 1) + allResult.get(numRow - 1).get(i));
        }
        rowResult.add(1);
        return rowResult;
    }

    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> allResult = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numRows; i++) {
            allResult.add(recursion1(i, allResult));
        }
        return allResult;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}

// == 해설 ==
import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {

    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int x = result.get(i - 1).get(j - 1);
                    int y = result.get(i - 1).get(j);
                    list.add(x + y);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}
