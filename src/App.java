import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double nota1, nota2, nota3, nota4, Media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota");
        nota2= sc.nextDouble();
        System.out.println("Insira a terceira nota");
        nota3 = sc.nextDouble();
        System.out.println("Insira a quarta nota");
        nota4 = sc.nextDouble();
        Media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media do aluno é: " +Media);
        sc.close();
    }
}
