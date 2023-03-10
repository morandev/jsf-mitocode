package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {
    private String nombre;
    private String mensaje;
    
    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void saludar() {
        this.mensaje = "Hola @".concat(nombre);
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
