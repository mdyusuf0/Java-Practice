class maxmin
{
	public static void main(String[]args)
	{
		int[] array={24,22,24,31,25,22,21};
		int max=array[0];
		int min=array[0];

		for(int i= 1; i<array.length;i++){
			if(array[i]>max){
			max= array[i];
	}
	if(array[i]<min){
	min=array[i];}
			
		}
	
	System.out.println("Max:"+ max);
	System.out.println("Min:"+min);
		}
		}
		