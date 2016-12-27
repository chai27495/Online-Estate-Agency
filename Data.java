/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {
    

    String name, details;
    int c;
    int price;
    

    Data() {
        name = "";
        c = 0;
        
    }

    void createProperty() {
        do {
            c = 1;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter name of seller : ");
                name = sc.nextLine();
                System.out.print("Property details(Address) : ");
                details = sc.nextLine();
                System.out.print("Enter price:");
                price = sc.nextInt();
            } catch (InputMismatchException e) { // to check for invalid inputs
                System.out.println();
                System.out.println("INVALID INPUT");
                System.out.println("RE-ENTER DETAILS");
                c = 0;
            }
        } while (c == 0);
    }

}

