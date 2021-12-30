/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

/**
 *
 * @author Rebe
 */
public class SerialNumberGenerator {
    private Integer serialNumber = 0;

    public SerialNumberGenerator() {   
    }
    
    public Integer next(){
        return serialNumber++;
    }
    
}
