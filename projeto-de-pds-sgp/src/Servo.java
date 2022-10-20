import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Servo {

    static Scanner teclado = new Scanner(System.in);

    public static String retornaString() {
        String a = teclado.nextLine();
        return a;
    }

    public static int retornaInteiro() {
        int a = teclado.nextInt();
        teclado.nextLine();
        return a;
    }

    public static int retornaInteiroIntervalo(int min, int max) {

        int resultado = -999; // VALOR ALEATÓRIO SÓ PARA TER MESMO
        boolean serInteiro = true, primeiroLoop = true;
        do {

            if ((!primeiroLoop) && serInteiro) { // SÓ MOSTRAR ESSE 'PRINT ABAIXO' QUANDO ESTIVER NA SEGUNDA ITERAÇÃO
                System.out.print("\n\nO número " + resultado
                        + " é uma escolha inexistente, por favor digite um inteiro entre " + min
                        + " a " + max + "(incluindo os limites): ");
            }

            serInteiro = true;

            try {
                String a = teclado.nextLine();
                resultado = Integer.parseInt(a);
            } catch (NumberFormatException e) { // SÓ VAI ACONTECER SE O "Integer.parseInt(a)" não for um inteiro
                serInteiro = false;
                System.out.print("\n\nIsso que você digitou não é uma escolha.\n\nDigite um número entre " + min + " e "
                        + max + "(incluindo os limites): ");
            }
            primeiroLoop = false;

        } while (!(resultado >= min && resultado <= max));
        return resultado;
    }

    public static Date retornaData() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {

            System.out.println("Digite uma data seguindo o seguinte padrão (dia/mês/ano): ");
            String entradaDoUsuario = teclado.nextLine();
            try {
                data = formatador.parse(entradaDoUsuario);
                break; //Esse 'break' só é executado caso tudo dê certo.
            } catch (ParseException e) {
                System.out.println(
                        "\n\nERRO: Prezado usuário, o que você digitou não é uma 'data' conforme o padrão pedido, por favor digite uma data conforme o padrão determinado\n\n");
            }

        }
        return data;
    }

    public static ArrayList<String> recebaTexto(String textoASerEnviado) {
        System.out.println(textoASerEnviado);
        ArrayList<String> textoDeMultiplasLinhas = new ArrayList<String>();
        textoDeMultiplasLinhas.clear();
        while (true) {
            exibaTextoJaEscrito(textoDeMultiplasLinhas);
            System.out.println("\n[Para parar de digitar digite '0']");
            String objetoString = retornaString();
            if (objetoString.equals("0") == true) {
                break;
            }
            textoDeMultiplasLinhas.add(objetoString);
        }
        return textoDeMultiplasLinhas;
    }

    public static void exibaTextoJaEscrito(ArrayList<String> textoEscrito) {
        if (!textoEscrito.isEmpty()) {
            for (String string : textoEscrito) {
                System.out.println(string);
            }
        }

    }
}