/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

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

        ArrayList<Service> list = new ArrayList<>();
        list.add(service1);
        list.add(service2);
        list.add(service3);
        list.add(service4);
        list.add(service5);
        list.add(service6);

        System.out.println(" 1. time asc \n 2. time desc \n 3. price asc \n 4. price desc \n 5.service asc \n 6.service desc");

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        switch (inputNum) {
            case 1:
                list.sort((a, b) -> a.getTime() - b.getTime());
                break;
            case 2:
                list.sort((a, b) -> b.getTime() - a.getTime());
                break;
            case 3:
                list.sort((a, b) -> (int) a.getPrice() - (int) b.getPrice());
                break;
            case 4:
                list.sort((a, b) -> (int) b.getPrice() - (int) a.getPrice());
                break;
            case 5:
                list.sort((p1, p2) -> p1.getServiceDescription().compareTo(p2.getServiceDescription()));
                break;
            case 6:
                list.sort((p1, p2) -> p2.getServiceDescription().compareTo(p1.getServiceDescription()));
                break;
        }
        System.out.println(list.toString());
    }
}
