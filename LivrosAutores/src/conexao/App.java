/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import ui.Menu;

/**
 *
 * @author pedro
 */
public class App {
    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        Menu men = new Menu();
        men.setVisible(true);
    }
}
