class duplicateofarray
{
static void sortedord(int[ ] arr)
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
System.out.print("The duplicate values are" +arr[j]);
}
}
}

public static void main(String args[])
{
int [ ] arr =new int [ ] {20,3,4,1,3,20};
sortedord(arr);
}
}