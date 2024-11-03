import java.util.Scanner;
import java.time.LocalDate;

public class Main
{

    public static void main(String[] args)
    {
        //Olá {nome}. Hoje é {dia-da-semana}, Bom dia.

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe seu nome");
        String nome = scanner.nextLine();

        LocalDate hoje =LocalDate.now();
        System.out.println(hoje.getDayOfWeek());


    }
}









