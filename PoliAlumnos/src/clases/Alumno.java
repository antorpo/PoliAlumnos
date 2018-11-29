package clases;

public class Alumno {
String nombre, programa;
int documento;
int edad;
    
public Alumno(String nombre, int edad, int documento, String programa){
this.nombre = nombre;
this.edad = edad;
this.documento = documento;
this.programa = programa;
}

public String obtenerInfo(){
return "Nombre: " + nombre + "\nEdad: " + edad + "\nDocumento: " + documento + "\nPrograma: " + programa;
}


// Metodos Getter
public String obtenerNombre(){
return nombre;
}

public int obtenerEdad(){
return edad;
}

public int obtenerDocumento(){
return documento;
}

public String obtenerPrograma(){
return programa;
}

// Metodos Setter
public void cambiarNombre(String nombre){
this.nombre = nombre;
}

public void cambiarEdad(int edad){
this.edad = edad;
}

public void cambiarDocumento(int documento){
this.documento = documento;
}

public void cambiarPrograma(String programa){
this.programa = programa;
}
    
    
}


