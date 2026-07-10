#include <iostream>
#include "assert.h"
using namespace std;

int main()
{
    //   int n;
    //   cin>>n;
    //   for(int row =0;row<n;row++){
    //       for(int col=0;col<n-row -1;col++){
    //           if(row==0|| col==0|| col<n-row){
    //               cout<<row+col+1;
    //           }
    //           cout<<" ";
    //       }
    //       cout<<endl;
    //   }

    // int n;
    //   cin>>n;
    //   for(int row =0;row<n;row++){
    //       for(int col=0;col<n-row -1;col++){
    //         cout<<" ";
    //       }
    //       for(int col=0;col<row+1;col++){
    //           cout<<col+1;
    //       }
    //       int start=row;
    //       for(int col=0;col<row;col++){
    //           cout<<start;
    //           start--;
    //         }
    //         cout<<endl;
    //     }

    // int n;
    //   cin>>n;
    //   for(int row =0;row<n;row++){
    //       for(int col=0;col<row+1;col++){
    //           if(col==0||col==row||row==n-1){
    //         cout<<col+1;
    //         }
    //     else{
    //         cout<<" ";
    //         }
    //     }
    //     cout<<endl;
    //   }

    // int n;
    //   cin>>n;
    //   for(int row =0;row<n;row++){
    //       for(int col=0;col<row+1;col++){
    //         cout<<"*";
    //       }
    //       cout<<endl;
    //   }
    //     for(int row =0;row<n;row++){
    //       for(int col=0;col<n-row-1;col++){
    //         cout<<"*";
    //       }
    //       cout<<endl;
    //   }

    // int n;
    // cin >> n;
    // assert(n<=9);
    // for (int row = 0; row < n; row++)
    // {
    //     for (int col = 0; col < n - row - 1; col++)
    //     {
    //         cout << "*";
    //     }
    //     for (int col = 0; col < row + 1; col++)
    //     {
    //         cout << row + 1;
    //         if (col != row)
    //         {
    //             cout << "*";
    //         }
    //     }
    //     for (int col = 0; col < n - row -1; col++)
    //     {
    //         cout << "*";
    //     }
    //     cout << endl;
    // }

    int n;
    cin >> n;

    for (int row = 1; row < n; row++)
    {   
        int c=1;
        for (int col = 1; col < row + 1; col++)
        {
            cout << c << " ";
            c=c*(row-col)/col;
        }
        cout<<endl;
    }    
}