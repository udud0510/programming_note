
/*
이 문제에서 알아두면 좋은 메소드
    replace : 일치되는 문자열을 모두 반환
    replaceFirst : 첫 번째로 일치되는 문자만 변환
    replaceAll : replace와 같지만 정규표현식 사용가능

    toBinaryString : 정수를 2진수의 String으로 반환
*/
public class SecretMap {

    public static void main(String[] args) {
        //입력 예제
        int arr1[], arr2[];
        arr1 = new int[]{9, 20, 28, 18, 11};
        arr2 = new int[]{30, 1, 21, 17, 28};
        printResult(secretMap(5, arr1, arr2));


        arr1 = new int[]{46, 33, 33, 22, 31, 50};
        arr2 = new int[]{27, 56, 19, 14, 14, 10};
        printResult(secretMap(6, arr1, arr2));
    }

    private static void printResult(String[] secretMap) {
        StringBuilder sb = new StringBuilder();
        for (String str : secretMap) {
            sb.append(", \"" + str + "\"");
        }
        System.out.println(sb.toString().replaceFirst(", ", ""));
    }


    public static String[] secretMap(int n, int[] arr1, int[] arr2) {

        String map[] = new String[n];
        String space = " ";
        for (int i = 0; i < n; i++) {

            //or 연산을 활용해 나온 결과값을 replace
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]).replace("0", " ").replace("1", "#");
            int x = n - map[i].length();

            //toBinaryString은 앞에 0을 붙여 반환하지 않아 그 경우 공백을 추가
            //공백이 한개 이상 일 경우
            if (map[i].length() < n) {
                for (int j = 0; j < x; j++) {
                    map[i] = space + map[i];
                }
            }
            System.out.println(map[i]);
        }
        return map;

    }


}
