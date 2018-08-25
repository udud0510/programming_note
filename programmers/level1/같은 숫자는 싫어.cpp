#include <vector>
#include <iostream>
 
using namespace std;
 
vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    int current= arr[0];
    for(int i=1;i<arr.size();i++)
    {
        if(current!=arr[i]){
            answer.push_back(current);
            current=arr[i];
        }
    }
    answer.push_back(arr[arr.size()-1]);
    
    return answer;
}