#include <bits/stdc++.h>
using namespace std;

void sol()
{
  
  char ch;
  cin>>ch;
  switch(ch)
  {
    case 'B':
    case 'b':
      cout<<"BattleShip\n";
      break;
    case 'C':
    case 'c':
      cout<<"Cruiser\n";
      break;
    case 'd':
    case 'D':
      cout<<"Destroyer\n";
      break;
    case 'F':
    case 'f':
      cout<<"Frigate\n";
      break;
  }
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}