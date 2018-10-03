package com.collection;

public class SelectionSort 
{
	public static void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			int j = i;
			for (int k = i+1; k < n; k++)
			{
				if (arr[k] < arr[j])
				{
					k = j;
				}
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		 }
	 }

	public static void main(String[] args) 
	{
		int arr[]= {10,40,5,20,8,6};
		System.out.println("Before Selection Sort");  
        for(int i:arr)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();
        sort(arr); 
        
        System.out.println("After Selection Sort");  
        for(int i:arr)
        {  
            System.out.print(i+" ");  
        }  
	}
}

/*public class SelectionSort
{  
    public static void selectionSort(int[] arr)
    {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
            {  
                if (arr[j] < arr[index])
                {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[])
    {  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
        System.out.println();
        selectionSort(arr1);//sorting array using selection sort  
        
        System.out.println("After Selection Sort");  
        for(int i:arr1)
        {  
            System.out.print(i+" ");  
        }  
    }
}*/