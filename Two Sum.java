/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

*/

import java.util.Arrays;
import java.util.HashMap;

public class Solution 
{
   public int[] twoSum(int[] numbers, int target) 
   {
        int tail = numbers.length-1;
        int[] n = new int[2];
        for (int i=0;i<tail;i++) 
        {
            for(int j=i+1;j<tail;j++) 
            {
                if(target ==(numbers[i]+numbers[j])) 
                {
                    n[0] = i;
                    n[1] = j;
                }
            }
        }
    	return n;
    }
}
