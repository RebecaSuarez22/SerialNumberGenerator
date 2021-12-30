/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata6;
import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.Scanner;

/**
 *
 * @author Rebe
 */


public class Main {
    public static void main(String[] args) {
        ToyFactory carToyFactory = new AmericanCarToyFactory();
        ToyFactory helicopterToyFactory = new AmericanHelicopterToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", carToyFactory);
        toyBusiness.add("helicopter", helicopterToyFactory);
        while(true){
            System.out.println("Introduce command:                        ('exit for exit')");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            
            if(nextLine.equals("exit")){
                break;
            }else if(nextLine.equals("car")){
                toyBusiness.produceToy(nextLine);
            }else if(nextLine.equals("helicopter")){             
                toyBusiness.produceToy(nextLine);
            }else {
                System.out.println("Command unknown");
            }
        }
        System.out.println("Client aplication finalized");
    }
}