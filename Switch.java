/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        
        int b;
        System.out.println("Enter number : ");
        a = input.nextInt();
        switch(a){
            case 0 :
               b = 1;
               break;
            case 2:
               b = 2;
                break;
                case 3 :
              b =3;
              break;
                default:
            b= 0;
        }
                System.out.println(" value = "+b);
                
        
    }
    
}
