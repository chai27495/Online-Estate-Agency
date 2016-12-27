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
public class Property extends Data {

    static int count = 0; // to generate id
    int status;
    int id;

    void createProperty() {
        count++;
        id = count;
        super.createProperty(); 
        System.out.println("Property id  : " + count);
        System.out.println();
        status = 0;
    }

    void display() {
        System.out.println(id + " \t " + name + "\t\t\t" + details + "\t\t" + price); // to display
        // customer
        // details
    }

}
    

