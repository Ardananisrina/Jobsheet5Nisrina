/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5Nisrina;

/**
 *
 * @author Nisrina Izdihar
 */
public class operatorbitwise {
    public static void main(String[] args) {
        int x = 12;
        int y = 20;
        
        int z;
        z=x|y;
        System.out.println("hasil operasi bitwise OR: " + z);
        
        z=x&y;
        System.out.println("hasil operasi bitwise AND: " + z);
        
        z=x^y;
        System.out.println("hasil operasi bitwise XOR: " + z);
        
        z=~x;
        System.out.println("hasil operasi bitwise NOT: " + z);
        
        z=x<<3;
        System.out.println("hasil operasi bitwise shift left: " + z);
        
        z=y>>2;
        System.out.println("hasil operasi bitwise shift right: " + z);
    
    }
    
}
