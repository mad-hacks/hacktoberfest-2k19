// CPP program to find solution of ax + by = n 
#include <bits/stdc++.h> 
using namespace std; 
  

void solution(int a, int b, int n) 
{ 
    for (int i = 0; i * a <= n; i++) { 
  
        if ((n - (i * a)) % b == 0) { 
            cout << "x = " << i << ", y = " 
                 << (n - (i * a)) / b; 
            return; 
        } 
    } 
  
    cout << "No solution"; 
} 
  
int main() 
{ 
    int a = 2, b = 3, n = 7; 
    solution(a, b, n); 
    return 0; 
} 
