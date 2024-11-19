class traingle_0_1{
public static void main(String...a){
int n=5;

for(int i=1; i<=n;i++)
{
//inner loop-->
for(int j=1;j<=i;j++){
int result = ((i + j) % 2 == 0) ? 1 : 0; //-->to print 0 or 1,if sum {i+j= even =1} else odd
System.out.print(result+ " ");

}

//-->outter loop
System.out.println();
}
}
}