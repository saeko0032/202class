/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;

/**
 *
 * @author CICCC-CIRAC
 */
public class SalonReport {
    public static void main(String[] args) {
        Service service1 = new Service("Cut", 8.00, 15);
        Service service2 = new Service("Shampoo", 4.00, 10);    
        Service service3 = new Service("Manicure", 18.00, 30);
        Service service4 = new Service("Style", 48.00, 55); 
        Service service5 = new Service("Permanent", 18.00, 35); 
        Service service6 = new Service("Trim", 6.00, 5);

    ArrayList<Service> list = new ArrayList<Service>();        
    list.add(service1);
    list.add(service2);
    list.add(service3);
    list.add(service4);
    list.add(service5);
    list.add(service6);
    
//    list.sort((p1,p2 -> p1.compareTo(p2));
    }
    
}
