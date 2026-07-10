#include <iostream>
using namespace std;

// float circleArea(float r){
//     float area = 3.14*r*r;
//     return area;
// }
// int main(){
//     float r;
//     cin>>r;
//     float area = circleArea(r);
//     cout<<"area of circle ="<<area<<endl;
// }

// void evenOdd(int num){
//   if(num%2 == 0){
//     cout<<"number is even";
//   }
//   else{
//     cout<<"number is odd";
//   }
// }
// int main(){
//     int num;
//     cin>>num;
//     evenOdd(num);
//     return 0;
// }

// int factorial(int num){
//     int fact =1;
//     for(int i=1 ;i<=num;i++){
//       fact = fact*i;
//     }
//     return fact;
// }
// int main(){
//     int num;
//     cin>>num;
//     int ans = factorial(num);
//     cout<<"factorial is "<<ans<< endl;
// }

// bool checkPrime(int n)
// {
//     int i = 2;
//     for (int i = 2; i < n; i++)
//     {
//         if (n % i == 0)
//         {
//             return false;
//         }
//     }
//     return true;
// }
// int main()
// {
//     int n;
//     cin >> n;
//     bool isPrime = checkPrime(n);
//     if (isPrime)
//     {
//         cout << "number is prime\n";
//     }
//     else
//     {
//         cout << "number is not prime\n";
//     }
// }

bool checkPrime(int n)
{
    int i = 2;
    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            return false;
        }
    }
    return true;
}
int main()
{
    int n;
    cin >> n;

    for (int i = 2; i < n; i++)
    {
        bool isPrime = checkPrime(i);
        if (isPrime)
        {
            cout << i << " ";
        }
    }
}
