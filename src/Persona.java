/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carab
 */
public class Persona {
    String nombre, apellido, tipo;
    int edad;
    
    public Persona (String nombre,String apellido, int edad, String tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    public boolean empiezaPor(String inicio){
        if(inicio.isEmpty()|| inicio.length()>nombre.length())
            return false;
        for (int i = 0; i < inicio.length(); i++)  //sirve para recorrer todos los caracteres que se tienen en una palabra
            if(inicio.charAt(i)!=nombre.charAt(i)) //Si es falsa la estimacion, son nombres o letras diferentes
            
                return false;
        
                return true;
            
    }
        @Override
        public String toString(){
            return "Nombre completo: "+ apellido +", "+nombre+"\nEdad: "+edad+"\nTipo: "+tipo;
        
    }
}
    

        
