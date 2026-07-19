#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int>arr {-9,-6,-8,1};

    int start =0;
    int end = arr.size()-1;
    int i=0;

    while(i <= end){
        if(arr[i]<0){
            swap(arr[i],arr[end]);
            end--;
        }
        else if(arr[i]>0){
            swap(arr[start],arr[i]);
            i++;
            start++;
        }
        else{
            i++;
        }
    }
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}