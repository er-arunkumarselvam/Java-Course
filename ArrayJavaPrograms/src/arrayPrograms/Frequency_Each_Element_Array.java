package arrayPrograms;

public class Frequency_Each_Element_Array {

	public static void main(String[] args) {
		
		Frequency_Each_Element_Array ap =new Frequency_Each_Element_Array();
		
		
		int[] arr= {10,20,30,40,50,10,20,30,40,50,10,20,30,80,10};
		ap.findingFnEachElementArray(arr);
		
	}

	private void findingFnEachElementArray(int[] arr) {
//		frequency of Each Element of given array
		int[] fn=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		int no=arr[i];//10
		
		int count=1;//Start with One time present
		for(int j=i+1;j<arr.length;j++)
		{
		if(no==arr[j])
		{
		count++;
		fn[j]=-1;
		}
		}
		if(fn[i]!=-1)
		fn[i]=count;
		}
		/*for(int i=0;i<arr.length;i++)
		{
			//if(fn[i]>0)//Frequency of repeated number of each element
			//if(fn[i]==1)//Not Duplicate number 
			if(fn[i]>1)//No of repeated number present in array
			{
				System.out.println(arr[i]+" is occurs "+fn[i]+" times.");
			}
		}*/
		int min=Integer.MAX_VALUE;//Minimum value of present in given array
		//int max= Integer.MIN_VALUE;//Maximum value of present in given array
		int position=0;// find the maximum position of an array
		for(int i=0;i<fn.length;i++)
		{
			//if(fn[i]<max)//compare the max value
			if(fn[i]<min && fn[i]>0)//compare the min value
			{
				min=fn[i];
//				max=fn[i];
				position=i;
			}
			
		}
		System.out.println("The minimum num of arr is "+min+" at position of "+position+". the given array value is "+arr[position]);
		/*for(int i=0;i<arr.length;i++)
		{
		
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
		
		System.out.print(fn[i]+"  ");
		}*/
		
		
		
	}

}
