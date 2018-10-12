/*    문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
입출력 예제
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false*/

public class ContactAddress {

    /*public static void main(String[] args) {
        System.out.println(phone_book(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(phone_book(new String[]{"123", "456", "789"}));
        System.out.println(phone_book(new String[]{"1235", "12", "123", "567", "88"}));

    }*/
    //스트링버퍼 사용
    static boolean phone_book(String[] str) {
        int length = str.length;
        StringBuffer sb = new StringBuffer();
        int sbLength = 0;

        for (int i = 0; i < length; i++) {
            sb.setLength(0);
            sb.append(str[i]);
            sbLength = sb.length();
            //System.out.println("sbLength : " + sbLength);
            for (int j = 0; j < length; j++) {
                if (i == j) {   //자시자신은 비교 할 필요가 없으니
                    continue;
                }
                //나머지 비교
                if (nmgCompare(str[j], (sbLength <= str[j].length()) && (sb.toString().equals(str[j].substring(0, sbLength).toString()))))
                    return false;
            }
        }
        return true;

    }

    private static boolean nmgCompare(String nmgString, boolean trueOrFalse) {
        if (trueOrFalse) {
            return true;
        }
        return false;
    }
}
