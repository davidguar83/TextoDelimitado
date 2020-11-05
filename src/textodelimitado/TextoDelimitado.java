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
import java.text.NumberFormat;
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
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"parafusos", "cravos", "tachas"};
        Double[] prezo = {3.0, 4.0, 5.0};

        try {

            PrintWriter escribir = new PrintWriter(new BufferedWriter(new FileWriter(new File("C:/Users/david/Desktop/prueba clase file/productos1.txt"))));

            BufferedReader ler = new BufferedReader(new FileReader(new File("C:/Users/david/Desktop/prueba clase file/productos1.txt")));

            for (int i = 0; i < cod.length; i++) {

                escribir.println(cod[i] + "\t" + desc[i] + "\t" + prezo[i]);

            }

            escribir.close();

            String cadea = ler.readLine();
            String[] valor = cadea.split("\t");

           

            Producto po3 = new Producto();

            po3.setCodigo(valor[0]);
            po3.setDescricion(valor[1]);
            po3.setPrezo(Double.parseDouble(valor[2]));

            System.out.println(po3.toString());

            cadea = ler.readLine();
            valor = cadea.split("\t");

            po3.setCodigo(valor[0]);
            po3.setDescricion(valor[1]);
            po3.setPrezo(Double.parseDouble(valor[2]));
            

            System.out.println(po3.toString());

            cadea = ler.readLine();
            valor = cadea.split("\t");

            po3.setCodigo(valor[0]);
            po3.setDescricion(valor[1]);
            po3.setPrezo(Double.parseDouble(valor[2]));

            System.out.println(po3.toString());

        } catch (IOException ex) {

            System.out.println("Error ");

        }
    }
}
