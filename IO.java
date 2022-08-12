
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roger
 */
public class IO
{
     public static Scanner getInput( String prompt )
    {
        String s = JOptionPane.showInputDialog( prompt );
        return new Scanner( s );
    }
     
   /** public static Scanner showMe()
            
    {
        String message;
        String g = JOptionPane.showMessageDialog( message);
        return new Scanner (g);
    }
    * */
}
