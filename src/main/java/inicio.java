import java.sql.Connection;
import java.sql.SQLDataException;

public class inicio {
    public static void main (String[] args){
        System.out.println("hello world");
        Conexion con = new Conexion();

        try (Connection cnx = con.get_connection()){
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
