/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import productsstream.Producto;

/**
 *
 * @author david
 */
public class TextoDelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Producto producto1 = new Producto();
        String[] cod = {"p1","p2","p3"};
        String[] desc = {"parafusos","cravos","tachas"};
        Double[] prezo = {3.0,4.0,5.0};

        try {

            PrintWriter escribir = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:/Users/david/Desktop/prueba clase file/productos1.txt"))));

            BufferedReader ler = new BufferedReader(new FileReader(new File("C:/Users/david/Desktop/prueba clase file/productos1.txt")));

            for (int i = 0; i <cod.length; i++) {

                escribir.println(cod[i]+"\t"+desc[i]+"\t"+prezo[i]+"\t");
               
                
            }

            escribir.close();
            
          /*  for (int j=0;j<cod.length;j++){
            
                System.out.println("Codigo: " +ler.readLine());
           
            
            }*/
            
            System.out.println(ler.readLine());
            System.out.println(ler.readLine());
            System.out.println(ler.readLine());
            
            
            
            

        } catch (IOException ex) {

            System.out.println("Error ");

        }
    }
}
