/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 **/
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class TwoSum
{

    /**
     *
     */
  
// daArray = new int [3];


    
  
    
  
   
        
               //public int[] TwoSum (int[] nums, int target)
               public TwoSum()
               {
                  
               }
                   
               
               
                public static int[] twoSums (int [] myArray, int target)
               
               {
                    
                    myArray = getArray();
                    //target = 9;
                    int [] ans = new int[2]; 
                    ans[0] = 0;
                    for ( int i =0;i < myArray.length;i++)
                    {
                        for (int j = 0; j < myArray.length;j++)
                        {
                            if ( myArray[i]!= myArray[j])
                            {
                               
                          
                                
                           
                                   if (myArray[i] + myArray[j] == target)
                               {
                                   ans[0] = myArray[i];
                                   ans[1] = myArray[j];
                                   i = myArray.length;
                                   j = myArray.length;
                               }
                            }
                            
                           
                        }
                    }
                   
                 
                    return ans;  
                   
               }
               
               public static void main(String[]args)
               {
                   //System.out.println("You are given an array with the numbers 2,7,11,15,3,5");
                  // System.out.println("See if the number you enter is the sum of two numbers in the array.");
                   Scanner Digit = IO.getInput("You are given an array with the numbers 2,7,11,15,3,5 \n"
                          +" See if the number you enter is the sum of two numbers in the array. \n"
                           + "Enter a positive odd number greater than zero and less than 20");
                     
                   int target2 = Digit.nextInt();  
                   int [] daArray = new int[2];
                   
                  int [] ans = twoSums(daArray,target2);
                   
                  
//                        for(int i =0; i<ans.length ; i++)
//                        {
//                            System.out.println(ans[i]);
//                        }
                 if (ans[0] == 0)
                 {
                    System.out.println("No results were found.") ; 
                    String ans2 = "No results were found.";
                   JOptionPane disp = new JOptionPane();
                   JFrame viewer = new JFrame();
                   JOptionPane.showMessageDialog(viewer, ans2);
                 }
                 else
                 {
                 //System.out.println(ans[0]+" + "+ ans[1]+" = "+target2) ;
                 String ans1 = ans[0]+" + "+ ans[1]+" = "+target2; 
                  JOptionPane disp = new JOptionPane();
                  JFrame viewer = new JFrame();
                  JOptionPane.showMessageDialog(viewer, ans1);
                 }
                  
                     
               }
               
                static int [] getArray()
               {
                   
                   int [] daArray =  {2,7,11,15,3,5};   
                   
                     
                    return daArray;
               }
     
}
