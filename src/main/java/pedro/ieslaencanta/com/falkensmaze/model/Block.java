/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.falkensmaze.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author JJG
 */

/*
* Clase Block, que representa a un solo bloque 
*/

@XmlRootElement
public class Block implements Serializable {

    private String value;
    // Constructor 
    public Block() {
        this.value = null;
    }
    // Obtiene el valor actual del bloque 
    public String getValue() {
        return this.value;
    }
    // Establece el valor del bloque  
    public void setValue(String value) {
        this.value = value;
    }
    // Comprueba si el bloque esta vacio
    public boolean isEmpty() {
        return this.value == null;
    }
}
