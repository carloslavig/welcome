import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Main
{

    public static void main(String[] args)
    {
        //Olá {nome}. Hoje é {dia-da-semana}, Bom dia.

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe seu nome");
        String nome = scanner.nextLine();

        LocalDate hoje =LocalDate.now();
        Locale brasil= new Locale("pt","BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora =  LocalDateTime.now();

        if (agora.getHour() >0 && agora.getHour() <12)
        {
            saudacao = "Bom dia! ";
        }
        else if (agora.getHour() >=12 && agora.getHour() <18)
        {
            saudacao= "Boa Tarde! ";
        }
        else if (agora.getHour() >=18 && agora.getHour() <24)
        {
            saudacao= "Boa noite! ";
        }
        else
        {
            saudacao= "Salvêê!";
        }

        System.out.printf("Olá, %s, meu consagrado. Hoje é %s. %s %n",nome,diaSemana,saudacao);

    }
}









