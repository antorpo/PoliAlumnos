package clases;
import java.util.ArrayList;

public class Listar {
ArrayList<Alumno> lista_alumnos = new ArrayList(); 
    

public void Listar(){}

public void agregarPersona(Alumno alumno){
lista_alumnos.add(alumno);
}
    
public Alumno buscarPersona(int documento){
for(Alumno alumno: lista_alumnos){
    if(alumno.obtenerDocumento()==documento){
    return alumno;
    }
}
return null;
}
   

public void modificarPersona(int documento, String nombre, int edad, int nuevo_doc, String programa){
for(Alumno buscar: lista_alumnos){
if(buscar.obtenerDocumento()==documento){
buscar.cambiarNombre(nombre);
buscar.cambiarEdad(edad);
buscar.cambiarDocumento(nuevo_doc);
buscar.cambiarPrograma(programa);
}
}
}


public void eliminarPersona(int documento){
for(Alumno alumno: lista_alumnos){
    if(alumno.obtenerDocumento()==documento){
    lista_alumnos.remove(alumno);
    break;
    }
} 
}

public ArrayList<Alumno> mostrarLista(){
return lista_alumnos;
}

}
