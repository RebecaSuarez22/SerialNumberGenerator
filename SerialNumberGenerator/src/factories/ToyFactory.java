/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;
import toyproduct.Toy;
/**
 *
 * @author Rebe
 */
public abstract class ToyFactory {
    public Toy produceToy(Integer serialNumber){
        Toy toy = createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(Integer serialNumber);
}
