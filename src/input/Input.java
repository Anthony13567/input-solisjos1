/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author rbowlen
 */
public class Input {

     /**
      * @param args the command line arguments
      * @throws java.io.IOException
      */
     public static void main(String[] args) throws IOException {
          Scanner scan = new Scanner(new File("stuff.txt"));
          
          // Create an Array
          String[] array = new String[5];
          
          // Take input line-by-line and store it in arr[]
          array[0] = scan.nextLine();
          array[1] = scan.nextLine();
          array[2] = scan.nextLine();
          array[3] = scan.nextLine();
          array[4] = scan.nextLine();
          
          out.printf("%s %s %s %s %s", array[0], array[1], array[2], array[3], array[4]);
          
          
          
          
          
     }
     
}
