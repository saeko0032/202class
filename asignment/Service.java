/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author CICCC-CIRAC
 */
public class Service {

    private String serviceDescription;
    private double price;
    private int time;

    public Service(String serviceDescription, double price, int time) {
        this.serviceDescription = serviceDescription;
        this.price = price;
        this.time = time;
    }

    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public double getPrice() {
        return this.price;
    }

    public int getTime() {
        return this.time;
    }

    void compareTo(Service p2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
