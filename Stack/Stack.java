//array declare
//variable t store size of stack in integer
//declarea a constructor passing any value
//declare a push function
//declare a pop function
//throw message
//create a print function to avoid rewrititing

class Stack{
private int[] array;
private int size;

int item = -1;
public Stack(int size){
this.size=size;
this.array=new int[size];

}
public void push(int item){
	item++;
	this.array[item]=item;
	
}
public int pop(){
	
int value =this.array[item];
item--;
return value;	
}

public void print(){
for(int i=0; i <=item; i++){
System.out.println(this.array[i]);
}
}

public static void main(String[]args){
	Stack obj = new Stack(5);
	
	obj.push(5);
	obj.push(4);
	obj.push(3);
obj.print();
	}
}