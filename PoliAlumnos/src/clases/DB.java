package clases;
import java.sql.*;

public class DB {
String host, user, pass;
public String tabla;
public Connection cn;
  
public DB(){}

public DB(String host, String user, String pass, String tabla){
this.host = host;
this.user = user;
this.pass = pass;
this.tabla = tabla;
}

public boolean validarConexion(){
try{
cn = DriverManager.getConnection("jdbc:mysql://" + host, user, pass);
return true;
}catch(Exception e){
return false;
} 
}   

}
