#include <iostream>
using namespace std;

int main()
{
    vector<int> arr{2, 4, 6, 7, 9, 8, 3, 1};
    int sum = 9;
    for (int i = 0; i < arr.size(); i++)
    {
        int element = arr[i];
        for (int j = i + 1; j < arr.size(); j++)
        {
            if (element + arr[j] == sum)
            {
                cout << "pair found (" << element << "," << arr[j] << ")" << endl;
            }
        }
    }
}