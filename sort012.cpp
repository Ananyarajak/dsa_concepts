#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> arr{2,0,2,1,1,0};

    int start = 0;
    int end = arr.size() - 1;
    int i = 0;

    while (start <= end)
    {
        if (arr[i] == 0)
        {
            swap(arr[start], arr[i]);
            i++;
            start++;
        }
        else if (arr[i] == 1)
        {
            swap(arr[i], arr[end]);
            end--;
        }
        else
        {
            // arr[i] == 2
            i++;
        }
        }
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i];
    }
    cout << endl;
    return 0;
}