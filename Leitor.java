import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Leitor{
    public Leitor(){
        try {
            FileReader leitor = new FileReader("texto.txt");
            BufferedReader ler = new BufferedReader(leitor);
            System.out.println(ler.readLine());
            System.out.println(ler.readLine());
            leitor.close();
        }catch(IOException io){
            System.out.println("erro de leitura!");
        }
    }
}
