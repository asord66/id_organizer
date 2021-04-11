import java.util.Scanner;

public class Organize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of IDs (Brazilian CPFs) you'd like to organize: ");
        int qtd = sc.nextInt(),i,j;

        sc.nextLine();

        String array[] = new String[qtd];

        System.out.printf("Copy and paste the %d ID(s): ", qtd);

        for(i=0; i<qtd; i++){
            array[i] = sc.nextLine();
            array[i] = array[i].replace(".", "");
            array[i] = array[i].replace("-", "");
        }

        for(i=0; i<qtd; i++){
            int contadorQtdCpf=0;
            int contadorPonto=0;
            int contadorLength=0;

            for(j=0; j < 11; j++){

                System.out.print(array[i].charAt(j));
                contadorLength++;
                contadorPonto++;

                if(contadorLength == array[i].length() - 3){
                    System.out.printf("%c-%c%c\n",array[i].charAt(array[i].length()-3),array[i].charAt(array[i].length()-2), array[i].charAt(array[i].length()-1) );
                    break;
                }
                if(contadorPonto == 3){
                    System.out.print(".");
                    contadorPonto=0;
                }
            }
        }
    }
}
