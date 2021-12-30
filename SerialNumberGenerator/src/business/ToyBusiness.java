/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproduct.Toy;

/**
 *
 * @author Rebe
 */


public class ToyBusiness {
    private Map<String,ToyFactory> factories;
    private final SerialNumberGenerator sn;

    public ToyBusiness(){
        this.sn = new SerialNumberGenerator();
        this.factories = new HashMap();
    }
    
    public Toy produceToy(String type){
        return factories.get(type).produceToy(sn.next());
    }

    public void add(String type, ToyFactory toyFactory) {
        factories.put(type, toyFactory);
    }
    
}