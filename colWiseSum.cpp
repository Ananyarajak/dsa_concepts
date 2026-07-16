#include <iostream>
using namespace std;

void colSum(int arr[][3], int row, int col)
{
    cout << "printing col- wise sum " << endl;
    for (int i = 0; i < row; i++)
    {
        int sum = 0;
        for (int j = 0; j < col; j++)
        {
            sum = sum + arr[j][i];
        }
        cout << sum << endl;
    }
}
int main()
{
    int arr[3][3];
    int row = 3;
    int col = 3;

    // input
    cout << "enter the element " << endl;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cin >> arr[i][j];
        }
        cout << endl;
    }

    // printing
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << arr[i][j];
        }
        cout << endl;
    }

    colSum(arr, row, col);
}
