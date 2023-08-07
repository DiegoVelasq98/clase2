
package vista;

import javax.swing.JOptionPane;


public class Cliente extends Persona {
    
    public Cliente (){};
    private String nit;

    public Cliente(String nombres, String apellidos, String direccion, String telefono, String Fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, Fecha_nacimiento);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
       protected String[] crear(){
           try
            {         
                    String datos[]= new String[6];      
                      datos[0] = getNit();
                      datos[1] = getNombres();
                      datos[2] = getApellidos();
                      datos[3] = getDireccion();
                      datos[4] = getTelefono();
                      datos[5] = getFecha_nacimiento();
              return  datos;            
                 }
                 
        catch(Exception ex)
            {
                  
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error en Query",JOptionPane.ERROR_MESSAGE);
                    return  null;
            }
           
           
           
       
   
   
}
       
       
       @Override
       protected void leer(){
           
        
           System.out.println("Nit: "+ getNit());
       }
}



    

