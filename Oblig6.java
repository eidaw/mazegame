import java.util.Scanner;

public class Oblig6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn filnavn");
        String filnavn = scanner.nextLine();

        
        Labyrint lab = new Labyrint(filnavn); //kommandolinje 0 er filnavn
        //String filnavn = null;
        //Labyrint lab = new Labyrint(args[0]); //kommandolinje 0 er filnavn
        //filnavn = args[0];



        System.out.println("Labyrinten ser slik ut:");
        System.out.println(lab);

        int valg, rad, kol;

        do {
            System.out.println("\nSkriv inn koordinater <rad> <kolonne> ('-1' for aa avslutte)");
            valg = scanner.nextInt();
            rad = valg;

            if (rad>=0){
                kol = scanner.nextInt();
                kol = scanner.nextInt();
                if (kol >= 0){
                    lab.finnUtveiFra(rad, kol);
                }
            }
        }while(valg!=-1);

        scanner.close();

    }

    
}
