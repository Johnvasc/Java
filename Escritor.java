import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Escritor{
    Scanner scan = new Scanner(System.in);
    public Escritor(){
        try{
            FileWriter filew = new FileWriter("texto.txt");
            System.out.println("Insira seu nome");
            String dinassauro = scan.nextLine();
            filew.write(dinassauro); filew.write("\n");
            System.out.println("Insira o que deseja para comer");
            String comida = scan.nextLine();
            filew.write(comida); filew.write("\n");
            filew.close();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
