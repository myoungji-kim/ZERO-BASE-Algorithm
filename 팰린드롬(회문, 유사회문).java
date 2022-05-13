
public class Practice2 {
    public static int solution(String str) {
        return isPalindrome(0, str.length()-1, str.toCharArray(), 0);
    }

    public static int isPalindrome(int left, int right, char[] arr, int delCnt) {
        while (left < right) {
            if (arr[left] != arr[right]) {
                if (delCnt == 0) {
                    if (isPalindrome(left + 1, right, arr, 1) == 0 ||
                        isPalindrome(left, right - 1, arr, 1) == 0) {
                        return 1;
                    } else {
                        return 2;
                    }
                } else {
                    return 2;
                }
            } else {
                left++;
                right--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Test code
        String[] str = {"abba", "summuus", "xabba", "xabbay", "comcom", "comwwmoc", "comwwtmoc"};
        System.out.println(solution("abba"));
        System.out.println(solution("summuus"));
        System.out.println(solution("xabba"));
        System.out.println(solution("xabbay"));
        System.out.println(solution("comcom"));
        System.out.println(solution("comwwmoc"));
        System.out.println(solution("comwwtmoc"));
    }
}
