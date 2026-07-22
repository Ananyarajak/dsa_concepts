#include<iostream>
#include<vector>
using namespace std;

int main(){
  vector<int>arr{1,2,5,4};

  int sum=0;
  for(int i=0;i<arr.size();i++){
    sum = sum+arr[i];
  }
  int n= arr.size()+1;
  int actualSum= n*(n+1)/2;

  int missingNum=actualSum - sum;
  cout<<"missing element is "<<missingNum<<endl;
}