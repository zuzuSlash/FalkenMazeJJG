/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedro.ieslaencanta.com.falkensmaze;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author JJG
 */


/*
* Clase Size, represnta el tamaño en cuanto el ancho y el alto 
 */
@XmlRootElement
public class Size implements Cloneable, Comparable<Size>, Serializable {

    // Variables del ancho y el alto 
    private int width;
    private int height;

    // Contructor predeterminado 
    public Size() {
    }

    // Constructor con los parametros de ancho y alto
    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Metodo para clonar un objeto
    public Object clone() throws CloneNotSupportedException {
        return new Size(this.getWidth(), this.getHeight());
    }

    // Metodo que compara si dos objetos size son iguales
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Size)) {
            return false;
        }
        if (this.getWidth() == ((Size) (o)).getWidth() && this.getHeight() == ((Size) (o)).getHeight()) {
            return true;
        } else {
            return false;
        }

    }

    // Metodo que compara dos objetos Size para ordenarlos 
    @Override
    public int compareTo(Size o) {
        if (this.getWidth() == o.getWidth() && this.getHeight() == o.getHeight()) {
            return 0;
        }
        if (this.getWidth() < o.getWidth()) {
            return -1;
        } else {
            return 1;
        }
    }

    // Metodo que muestra el tamaño del objeto size (de manera numerica) 
    public String toString() {
        return "W:" + this.width + " H:" + this.height;
    }

    /**
     * Metodos getters y setters para el ancho y el alto del objeto size
     */
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
