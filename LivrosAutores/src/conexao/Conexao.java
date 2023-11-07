/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;
import java.sql.*;
/**
 *
 * @author laboratorio
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/bdlivrosautores?useTimezone=true&serverTimezone=UTC",
                  "root", "0011");
            return conn;
        }
        catch(Exception e){
            System.out.println("Erro ao conectar banco "+e.getMessage());
            return null;
        }
    }
}
