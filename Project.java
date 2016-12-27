/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author me
 */


import java.io.*;
import java.util.*;

public class Project {

    public static void main(String args[]) {
        int opt = 0, n=0, x ;
        int ch ;
        float depo = 0;
        String c1 , c2="y";
        Buy b = new Buy();
        Property p[] = new Property[10];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Login as: \n1.customer\n2. manager");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Select from the following option ");

                    System.out.println("1:Buy Property");
                    System.out.println("2:Sell Property");
                    System.out.println("3:Exit");
                    System.out.print("Enter option : ");
                    opt = sc.nextInt();

                    switch (opt) {
                        case 1:
                            System.out.println("ID \t NAME \tLOCATION\t PRICE");

                            for (int i = 0; i < Property.count; i++) {
                                if (p[i].status == 0) {
                                    p[i].display();
                                }
                            }

                            System.out.print("Enter the choice of property you want to buy : ");
                            ch = sc.nextInt();
                            if (ch <= Property.count && ch > 0) {		// to check if customer is valid
                                   
                                b.book(p[ch - 1]);
                            }

                            break;
                        case 2:

                            do {
                                System.out.println("are you sure you want to sell (Y/N) ????");
                                c2 = sc.next();
                                if (!(c2.charAt(0) == 'Y' || c2.charAt(0) == 'y' || c2.charAt(0) == 'n' || c2.charAt(0) == 'N')) {
                                    System.out.println("***** invalid input *****");
                                }
                            } while (!(c2.charAt(0) == 'Y' || c2.charAt(0) == 'y' || c2.charAt(0) == 'n' || c2.charAt(0) == 'N'));

                            if (c2.charAt(0) == 'Y' || c2.charAt(0) == 'y') {
                                p[n] = new Property();
                                p[n].createProperty();
                                n++;
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("************************ THANK YOU ************************");
                            System.exit(0);
                            break;
                    }
                    break;
                case 2: {
                    System.out.println("1:Add new Property detail ");
                    System.out.println("2: display");
                    System.out.println("3:Exit");
                    System.out.print("Enter option : ");
                    opt = sc.nextInt();
                    switch (opt) {

                        case 1:
                            System.out.println("**************** OFFICE ****************");

                            try {					// to check for valid input
                                System.out.print("Number of properties to be entered? ");
                                x = sc.nextInt();
                                System.out.println();
                            } catch (InputMismatchException e) {
                                System.out.println("INVALID INPUT");
                                continue;
                            }

                            for (int i = n; i < n + x; i++) {
                                System.out.println("ENTER DETAILS ");
                                p[i] = new Property();
                                p[i].createProperty();
                            }
                            n += x;
                            break;

                        case 2:
                                for (int i = 0; i < Property.count; i++) 
                                 {
                                     if(p[i].status == 0)
                                 {
                                    p[i].display();
                                    System.out.print("\t\t\t Available");
                                }
                                 else
                                 {
                                      p[i].display();
                                    System.out.print("\t\t\t Sold");
                                 }
                                 }
                            
                    break;
                 case 3:
                    System.out.println("************************ THANK YOU ************************");
                    System.exit(0);
                    break;

                    }
                }
            }

            do {
                System.out.println("Do you want to continue (Y/N) ???");
                c1=sc.next();
                System.out.println();
                if (!(c1.charAt(0) == 'Y' || c1.charAt(0) == 'y' || c1.charAt(0) == 'n' || c1.charAt(0) == 'N')) {
                    System.out.println("***** invalid input *****");
                }
            } while (!(c1.charAt(0) == 'Y' || c1.charAt(0) == 'y' || c1.charAt(0) == 'n' || c1.charAt(0) == 'N'));
            
        } while ((c2.charAt(0) == 'Y' || c2.charAt(0) == 'y') && (opt != 5));

    }
}
