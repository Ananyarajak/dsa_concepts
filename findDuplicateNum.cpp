#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int>arr {3,4,7,3,0,1};
    sort(arr.begin(),arr.end());

    for(int i=0;i<arr.size()-1;i++){
        if(arr[i]==arr[i+1]){
            cout<< arr[i]<<endl;
        }
    }
}