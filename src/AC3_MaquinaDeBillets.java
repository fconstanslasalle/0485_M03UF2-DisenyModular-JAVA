import com.sun.source.tree.ReturnTree;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AC3_MaquinaDeBillets {
    private static void main(String[] args){
        //Declarem una matriu de dos dimensions.
        int[][]Billets;
        Billets = new int[2][1]; //La Dimensionem 3 x 2
        int NumBillets=0;
        boolean ModeManteniment=false
        do{
            Billets=DemanarTipusDeBillet(Billets, NumBillets);
            Billets=DemanarZona(Billets);


        }while(NumBillets<3)||(ModeManteniment!=false);



    }

    private static int[][] DemanarZona(int[][] billets) {
    }

    private static int[][] DemanarTipusDeBillet(int[][] billets, int NumBillets) {
        //
        Scanner LlegirOpció = new Scanner(System.in);
        int TipusBillet=0;

        System.out.println("Sisplau, escull quins tipus de billet vols?");
        System.out.println("1. Billet Senzill");
        System.out.println("2. T-Casual");
        System.out.println("3. T-Usual");
        System.out.println("4. T-Familiar");
        System.out.println("5. T-Jove");
        TipusBillet =LlegirOpció.nextInt();

        switch (TipusBillet){
            case 1:

        }


    }
}
