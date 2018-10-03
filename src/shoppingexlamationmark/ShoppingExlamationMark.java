/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingexlamationmark;

/**
 *
 * @author gasco1246
 */
import java.util.Scanner;
public class ShoppingExlamationMark {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable declaration
        final double KEY, USB, MOUSE, TAX;
        double numKey, numUsb, numMouse, keyCost, usbCost, mouseCost, subTotal, total;
        KEY = 19.99;
        USB = 49.99;
        MOUSE = 25.99;
        TAX = 1.13;
        
        Scanner keyInput = new Scanner(System.in);
        //prompts receives, rounds and stores input
        System.out.println("How many keyboards do you want?");
        numKey = keyInput.nextDouble();
        keyCost = numKey*KEY;
        keyCost = keyCost *100;
        keyCost = Math.round(keyCost);
        keyCost = keyCost/100;
        
        System.out.println("How many USBs do you want?");
        numUsb = keyInput.nextDouble();
        usbCost = numUsb*USB;
        usbCost = usbCost *100;
        usbCost = Math.round(usbCost);
        usbCost = usbCost/100;
        
        System.out.println("How many mice do you want?");
        numMouse = keyInput.nextDouble();
        mouseCost = numMouse*USB;
        mouseCost = mouseCost *100;
        mouseCost = Math.round(mouseCost);
        mouseCost = mouseCost/100;
        //outputs costs per item
        System.out.println("Keyboards : $"+keyCost);
        System.out.println("USBs : $"+usbCost);
        System.out.println("Mice : $"+mouseCost);
        
        //calculates, rounds and outputs subtotal
        subTotal = keyCost+usbCost+mouseCost;
        subTotal = subTotal *100;
        subTotal = Math.round(subTotal);
        subTotal = subTotal/100;
        System.out.println("Subtotal : $"+subTotal);
        
        //calculates, rounds, and outputs total
        total = subTotal*TAX;
        total = keyCost+usbCost+mouseCost;
        total = total *100;
        total = Math.round(total);
        total = total/100;
        System.out.println("Total : $"+total);
        
        
        
        
        
                
        
        
        
    }
    
}
