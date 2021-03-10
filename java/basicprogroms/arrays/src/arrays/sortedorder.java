class sortedorder
{
static void sortedord(int[ ] arr)
{
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length-1;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
}
}
}
}

public static void main(String args[])
{
int [ ] arr =new int [ ] {20,3,4,1};
sortedord(arr);
}
}