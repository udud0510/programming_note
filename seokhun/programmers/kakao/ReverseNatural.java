import java.util.Arrays;
import java.util.Scanner;

/*자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/
public class ReverseNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String arr[] = n.split("");

        int len = arr.length;

        int res[] = new int[len];
        String strnum[] = new String[len];

        for (int i = 0; i < len; i++) {
            strnum[i] = arr[len - i - 1];
            res[i] = Integer.parseInt(strnum[i]);
        }

        System.out.println(Arrays.toString(res));
    }

}
