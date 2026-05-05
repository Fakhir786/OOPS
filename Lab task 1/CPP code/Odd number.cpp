#include<iostream>
using namespace std;
int main()
{
	int coloumn,row;
	int x=0;
	cout<<"Enter the number of coloumn you want in an array:";
	cin>>coloumn; 
	cout<<"Enter the number of row you want in an array:";
	cin>>row;
	int arr1[row][coloumn];
	cout<<"Enter values in an array:";
	for(int i=0;i<row;i++)
	for(int j=0;j<coloumn;j++)
	cin>>arr1[i][j];
	cout<<"The odd values are:"<<endl;
	for(int i=0;i<row;i++)
	{
	for(int j=0;j<coloumn;j++)
	if(arr1[i][j]%2!=0){
	x++;
	cout<<arr1[i][j]<<" "<<endl;	
}
}
cout<<"The total output values are:"<<x;
	return 0;
}