
public class ArraySorting {

 public static void main(String[] args) {
int	temp;
int a[]= {9,3,7,11,13,15,-7,-11,8};
for(int i=0;i<a.length;i++) {
	for (int j=0;j<a.length;j++)
	{
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
	for(int x:a ) {
		System.out.println(x);
		
	}
}
}
