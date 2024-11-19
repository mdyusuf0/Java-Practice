class halfpyramidreverse180
{
public static void main(String[]args){

int m=5;


for(int i=1;i<=m;i++)
{
//inner loop-> space print

for(int j=1;j<=m-i;j++)
{
System.out.print(" ");
}
//inner loop-> star print

for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();

}
}
}

