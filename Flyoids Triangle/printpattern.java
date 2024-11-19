class printpattern{
public static void main(String...a){
int n =5;
int number=1; //variable to print output

for(int i=1; i<=n;i++){
//inner loop->>
for(int j=1;j<=i;j++){

System.out.print(number + " ");
number++;
}
//outer loop->>
System.out.println();
}
}
}
