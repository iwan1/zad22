package zad22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
	public static void main(String[] args) {
        // TODO code application logic here
        List<Sortowanko> lista = new ArrayList();
        try{
            BufferedReader read = new BufferedReader(new FileReader("tekst.txt"));
            PrintWriter write = new PrintWriter(new FileWriter("sort.txt"));
            
            String line;
            while ((line = read.readLine()) != null) {
              lista.add(new Sortowanko(line));
              System.out.println(line);
            }
            Collections.sort(lista);
            while(lista.size() != 0){
                write.println(lista.get(0));
                System.out.println(lista.get(0));
                lista.remove(0);
            }
            write.close();
            read.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Blad 1");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Blad 2");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
	 
}
