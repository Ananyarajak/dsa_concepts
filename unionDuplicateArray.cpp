#include <iostream>
using namespace std;

int main()
{
    int arr[] = {2, 4, 6, 7, 3};
    int sizea = 5;
    int brr[] = {1, 6, 7, 9};
    int sizeb = 4;
    vector<int> ans;

    for (int i = 0; i < sizea; i++)
    {
        ans.push_back(arr[i]);
    }
    for (int i = 0; i < sizeb; i++)
    {
        bool found = false;

        for (int j = 0; j < sizea; j++)
        {
            if (brr[i] == arr[j])
            {
                arr[j] = INT_MIN; // Mark as visited
                found = true;
                break;
            }
        }
        if (!found)
        {
            ans.push_back(brr[i]);
        }
    }

    cout << "union of array is " << endl;
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }
    cout << endl;
}