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
            int element2 = arr[j];
            for (int k = j + 1; k < arr.size(); k++)
            {
                if (element + arr[j] + arr[k] == sum)
                {
                    cout << "pair found (" << element << "," << arr[j] << ","<<arr[k]<<")" << endl;
                }
            }
        }
    }
}