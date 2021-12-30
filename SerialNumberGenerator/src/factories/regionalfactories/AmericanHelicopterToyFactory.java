/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories.regionalfactories;
import business.ToyBusiness;
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanCarToy;
import toyproduct.models.AmericanHelicopterToy;

/**
 *
 * @author Rebe
 */


public class AmericanHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) { 
        return new AmericanHelicopterToy(serialNumber);
    }
    
}