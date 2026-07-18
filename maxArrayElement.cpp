#include <iostream>
using namespace std;

// int maxElement(int arr[][3], int row, int col)
// {
//     int max = INT_MIN;
//     for (int i = 0; i < row; i++)
//     {
//         for (int j = 0; j < col; j++)
//         {
//             if(arr[i][j]>max)
//             max = arr[i][j];
//         }
//     }
//     return max;
// }

// int minElement(int arr[][3], int row, int col)
// {
//     int min = INT_MAX;
//     for (int i = 0; i < row; i++)
//     {
//         for (int j = 0; j < col; j++)
//         {
//             if(arr[i][j]<min)
//             min = arr[i][j];
//         }
//     }
//     return min;
// }

int transposeArray(int arr[3][3], int row, int col)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << arr[j][i]<<" ";
        }
        cout << endl;
    }
    return 0;
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
    // cout<< maxElement(arr, row, col)<< endl;
    // cout<< minElement(arr, row, col)<< endl;

    cout << transposeArray(arr, row, col) ;
}
