import java.util.Scanner;

public class At4 {
    public static void main(String[] ars) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite uma frase");
        String frase = scan.nextLine();
        //String[] vetorFrase = frase.toUpperCase().split(" ");
        //tirando os espaços
        String fraseSemEspaco = frase.replaceAll(" ", "");
        int cont = 1;
        //String teste = " ";
        for(int i=0; i < frase.length(); i++){
            char p = frase.charAt(i);
            if(p == ' '){
                cont++;
            }
        }
        //tanto de caracter
        System.out.println("tanto de caracter da frase: "+fraseSemEspaco.length());
        //tanto de palavras
        System.out.println("tanto de palavras: "+cont);
    }
}
 