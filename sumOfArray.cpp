#include<iostream>
using namespace std;

int main(){
    int size;
    cin>>size;
    int num[10];
    int sum=0;
    for(int i=0;i<size;i++){
        cin>>num[i];
        sum=sum+num[i];
    }
    cout<<"sum of array is "<<sum<< endl;

}