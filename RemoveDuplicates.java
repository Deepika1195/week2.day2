package week2.day2;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as jack part of jack java sessions in java week1";
		int count=0;
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++)
		{
			for (int j = 0; j < split.length; j++)
			{
				
				if (split[i].equals(split[j])) 
				{
					if (i != j)
					{
					count++;
					        if (count>1) 
					        {
						    split[i] = "";					        
					        } 
				    }
			    } 
		     }
        }	
		
		for (int k = 0; k < split.length; k++) {
			if(split[k] != "") {
				System.out.print(split[k]+" ");	
			}
		}
		
     
	}

}