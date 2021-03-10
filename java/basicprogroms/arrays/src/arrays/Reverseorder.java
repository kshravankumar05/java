class Reverseorder
{
static void sortedord(int[ ] arr)
{
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(" "+arr[i]);
}
}

public static void main(String args[])
{
int [ ] arr =new int [ ] {20,3,4,1};
sortedord(arr);
}
}