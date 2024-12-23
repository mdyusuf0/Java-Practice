class numpyramid{
public static void main(String...a){

int n=5;

for(int i=0;i<=n;i++){
for (int j=0;j<=i;j++){
System.out.print("*" + " ");
}

System.out.println(" ");
}




int m=5;
for(int i=1; i<=m;i++)
{
//inner loop->print 1 to 5
for(int j=1;j<=m-i+1;j++){
System.out.print("*" + " ");
}
//outter loop
System.out.println();
}
}
}