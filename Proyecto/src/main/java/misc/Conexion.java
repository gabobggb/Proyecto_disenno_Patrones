package misc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexion {
    private static final String URL = "jdbc:mysql://srv863.hstgr.io:3306/u484426513_ppoc225";
    private static final String USER = "u484426513_ppoc225";
    private static final String PASSWORD = "jXc7w:|7Gy;";


    // hacemos la conection
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);

        }catch (SQLException e){
            System.out.println("Error al conectar base de datos: "+ e.getMessage());
            return null;
        }
    }

    public static void main(String[] args){
        Connection conexion = getConnection();
        if (conexion != null){
            System.out.println("Conectado a la base de datos");
            try {
                conexion.close();

            } catch (SQLException e){
                System.out.println("Erro al desconectar con base de datos: "+ e.getMessage());

            }

        } else {
            System.out.println("Error al desconectar base de datos");
        }
    }
}
