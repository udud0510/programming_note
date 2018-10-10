import java.util.LinkedHashMap;

/*      문제 설명
        스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.

        예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.

        종류	이름
        얼굴	동그란 안경, 검정 선글라스
        상의	파란색 티셔츠
        하의	청바지
        겉옷	긴 코트
        스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

        제한사항
        clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
        스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
        같은 이름을 가진 의상은 존재하지 않습니다.
        clothes의 모든 원소는 문자열로 이루어져 있습니다.
        모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
        스파이는 하루에 최소 한 개의 의상은 입습니다.
        입출력 예
        clothes	return
        [[yellow_hat, headgear], [blue_sunglasses, eyewear], [green_turban, headgear]]	5
        [[crow_mask, face], [blue_sunglasses, face], [smoky_makeup, face]]	3*/
//카테고리가 같으면 각각 갯수 카운트해서 바로 리턴
//카테고리가 다르면 각각 갯수 카운트 + 이외의 연산(카테고리 다른것끼리)
//카테고리는 중복되니까 value값으로 옷을 key
//+1씩을 더한 것은 착용하지 않은 경우가 추가 되기 때문이고 마지막으로 -1을 한것은 모든 부위를 입지 않은 경우는 없기 때문입니다.

public class Camouflage {
    /*public static void main(String[] args) {
        System.out.println(camouflage(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));;
        System.out.println(camouflage(new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }*/
    static int camouflage(String[][] clothes) {
        int answer = 1;
        int length = clothes.length;
        String name = "";
        String kind = "";
        int result = 0;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        //2차원 배열을 map에 담기
        for (int i = 0; i < length; i++) {
            name = clothes[i][0];
            kind = clothes[i][1];

            if (!map.containsKey(kind)) {
                map.put(kind, 1);
            } else {
                map.put(kind, map.get(kind) + 1);
            }
        }
        int size = map.size();
        for (String str : map.keySet()) {
            if (size == 1) { //사이즈가 1이면 다 같은 카테고리이므로
                return map.get(str); //그 갯수만큼 바로 리턴
            } else {
                // 아닐경우
                // (value+1) * (value+1) ~~ value 있는만큼 연산후 -1
                result = map.get(str) + 1;
                answer = answer * result;
            }
        }
        return answer - 1;
    }
}
