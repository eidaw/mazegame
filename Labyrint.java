import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Labyrint {

    private Rute [][] labArray;
    private int rad, kol;
    private int r = 0, k = 0;

    public Labyrint(String filnavn){

        File fil = new File(filnavn);
        Scanner sc;

        try{
            sc = new Scanner(fil);

            r = sc.nextInt();
            k = sc.nextInt();

            this.rad = r;
            this.kol = k;
            this.labArray = new Rute[this.rad][this.kol];
            String temp = sc.nextLine();

            int i = 0;
            while (sc.hasNextLine()) {
                temp = sc.nextLine();
                for (int j = 0; j < this.kol; j++) {
                    if (temp.charAt(j) == '.') { //for char kunne man kun bruke '' og ikke ""
                        if (i == 0 || i == this.rad -1 || j == 0 || j == this.kol -1) {
                            this.labArray[i][j] = new HvitRute(i, j, this);
                        } else {
                            this.labArray[i][j] = new Aapning(i, j, this);
                        } 
                    }
                    if (temp.charAt(j) == '#') {
                        this.labArray[i][j] = new SortRute(i, j, this);
                    }
                }
                i++;
            }

            for (i = 0; i < this.rad; i++) {
                for (int j = 0; j < this.kol; j++) {
                    if (j + 1 < this.kol) {
                            this.labArray[i][j].oest = this.labArray[i][j + 1];
                        } else {
                            this.labArray[i][j].oest = null;
                        }

                        if (j - 1 >= 0) {
                            this.labArray[i][j].vest = this.labArray[i][j - 1];
                        } else {
                            this.labArray[i][j].vest = null;
                        }

                        if (i - 1 >= 0) {
                            this.labArray[i][j].nord = this.labArray[i - 1][j];
                        } else {
                            this.labArray[i][j].nord = null;
                        }

                        if (i + 1 < this.rad) {
                            this.labArray[i][j].soer = this.labArray[i +1][j];
                        } else {
                            this.labArray [i][j].soer = null;
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }    
    

    public void finnUtveiFra(int rad, int kol) {
        System.out.println("Aapninger: ");
        this.labArray[rad][kol].finn(null);
    }


   @Override
    public String toString(){
        String resultat = "";

        for (int i = 0; i < this.rad; i++){
            for (int j = 0; j < this.kol; j++) {
                resultat += this.labArray[i][j].toString();
            }
            resultat += "\n";       //ny linje
        }
        return resultat;
    }



    






}
    


    
