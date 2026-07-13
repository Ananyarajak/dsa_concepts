#include <iostream>
using namespace std;

int main()
{
    int arr[] = {2, 4, 6, 7, 3};
    int sizea = 5;
    int brr[] = {1, 8, 9};
    int sizeb = 3;
    vector<int> ans;

    for (int i = 0; i < sizea; i++)
    {
        ans.push_back(arr[i]);
    }

    for (int i = 0; i < sizeb; i++)
    {
        ans.push_back(brr[i]);
    }

    cout << "union of array is " << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }
    cout<<endl;
}