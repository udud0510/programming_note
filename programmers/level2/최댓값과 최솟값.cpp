//- 문제 설명
//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
//예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.

//- 제한 조건
//s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

#include <string>
#include <vector>
#include <sstream>//stringstream
#include <algorithm> 
 
using namespace std;
 
string solution(string s) {
    string token = "";
    string answer = "";
    vector<int> arr;
    int min_value;
    int max_value;
 
 
    for (stringstream sts(s); (sts >> token);)//문자열을 토큰으로 잘라서 
    {                                          //int형으로 형변환 해준뒤에 벡터 arr에 넣었다.
        arr.push_back(stoi(token));
    }
 
    min_value = arr[0];
    max_value = arr[0];
 
    for (int i = 1; i < arr.size(); i++)//벡터 arr에서 최소값 최대값을 찾았다.
    {
        min_value = min(min_value, arr[i]);
        max_value = max(max_value, arr[i]);
    }
 
    answer=to_string(min_value)+' '+to_string(max_value);//int형을 string으로 형변환하고 answer에 넣었다.
 
    return answer;
}