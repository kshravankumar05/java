class sortarrydes
{

static void sortarr(int arr[])
{
int temp=0;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
}
}
System.out.print("The descding order is: ");
for(int i=0;i<arr.length;i++)
{
System.out.print(" "+arr[i]);
}

}
public static void main(String args[])
{
int arr[]=new int[] {5,2,8,4,1,3};
sortarr(arr);
}
}