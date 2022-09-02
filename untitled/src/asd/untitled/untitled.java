import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {

        String nome;
        String endereco;
        String sexo;
        String eventos;
        String categorias;

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("bem vindo");
        System.out.println("");
        System.out.println("");

        System.out.println("infome o nome");
        nome = scanner1.nextLine();

        System.out.println("informe o enereço");
        endereco = scanner1.nextLine();

        System.out.println("infome o sexo");
        sexo = scanner1.nextLine();

        System.out.println("");
        System.out.println("selecione o evento");
        System.out.println("");
        System.out.println("festas");
        System.out.println("1 - festa da coxinha");
        System.out.println("2 - festa do sushi");
        System.out.println("3 - aniversario da cidade");
        System.out.println("");
        System.out.println("shows");
        System.out.println("4 - show de rock");
        System.out.println("5 - baile funk");
        System.out.println("6 - show sertanejo");
        System.out.println("");
        System.out.println("next - outros eventos");
        
        System.out.println("");
        categorias = scanner1.nextLine();


        if ("1".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - festa da coxinha");
        }
        if ("2".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - festa do sushi");
        }
        if ("3".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - aniversario da cidade");
        }
        if ("4".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - show de rock");
        }
        if ("5".equals(categorias)) {
            System.out.println("evento selecionado com sucesso -baile funk");
        }
        if ("6".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - show sertanejo");
        }
        if ("next".equals(categorias)) {
            System.out.println("");
            System.out.println("peças de teatro");
            System.out.println("7 - a pequena sereia");
            System.out.println("8 - vikings");
            System.out.println("9 - zootopia");
            System.out.println("");
            System.out.println("eventos esportivos");
            System.out.println("10 - jogo  de futebol");
            System.out.println("11 - jogo de basquete");
            System.out.println("12 - campeonato de skate");
            System.out.println("menu - retornar ao menu anterior");
            System.out.println("");
            categorias = scanner1.nextLine();

        }
        if ("7".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - a pequena sereia");
        }
        if ("8".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - vikings");
        }
        if ("9".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - zootopia");
        }
        if ("10".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - jogo  de futebol");
        }
        if ("11".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - jogo de basquete");
        }
        if ("12".equals(categorias)) {
            System.out.println("evento selecionado com sucesso - campeonato de skate");
        }
        if ("menu".equals(categorias)) {
            System.out.println("");
            System.out.println("selecione o evento");
            System.out.println("");
            System.out.println("festas");
            System.out.println("1 - festa da coxinha");
            System.out.println("2 - festa do sushi");
            System.out.println("3 - aniversario da cidade");
            System.out.println("");
            System.out.println("shows");
            System.out.println("4 - show de rock");
            System.out.println("5 - baile funk");
            System.out.println("6 - show sertanejo");
            System.out.println(""); 
            categorias = scanner1.nextLine();

            if ("1".equals(categorias)) {
                System.out.println("evento selecionado com sucesso - festa da coxinha");
            }
            if ("2".equals(categorias)) {
                System.out.println("evento selecionado com sucesso - festa do sushi");
            }
            if ("3".equals(categorias)) {
                System.out.println("evento selecionado com sucesso - aniversario da cidade");
            }
            if ("4".equals(categorias)) {
                System.out.println("evento selecionado com sucesso - show de rock");
            }
            if ("5".equals(categorias)) {
                System.out.println("evento selecionado com sucesso -baile funk");
            }
            if ("6".equals(categorias)) {
                System.out.println("evento selecionado com sucesso - show sertanejo");
            }
        }
    }
}