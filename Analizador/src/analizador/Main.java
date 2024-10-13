/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import jflex.exceptions.SilentExit;

/**
 *
 * @author pedro m. toribio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SilentExit {
        String ruta = "C://Users//Pedro M. Toribio//Desktop//analizador_lexico//Analizador//src//analizador//Lexer.flex";
        generarlexer(ruta);
    }
    public static void generarlexer(String ruta) throws SilentExit {
        String[] flexOptions = {ruta};  
        jflex.Main.generate(flexOptions); 
    }
}
