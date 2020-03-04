package edu.campus02;

public class Main {

    public static void main(String[] args) {
	    // The sun is shining or it is raining
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;
        System.out.println("Die Sonne scheint und es regnet: " + ergebnis);
        // am I crazy or do I know my way around?
        boolean verwirrt = false;
        boolean ichkennemichaus = true;

        ergebnis = verwirrt || ichkennemichaus;
        // sout then tabulator
        System.out.println("I am crazy or I know my way around: " + ergebnis );

        // Beispiel 3 on the PPT 2
        // (1>3 && (!3-1 < 5)) || 2 == 4*4
        boolean teil1;
        boolean teil2;
        boolean ergebnis3;
        teil2 = 2==4*4;
        teil1 = 1>3 && !(3-1 < 5);
        ergebnis3 = teil1 || teil2;
        System.out.println("Ergebnis 3: " + ergebnis3);

        //Beispiel 4 on PPt 2
        boolean teil3;
        boolean teil4;
        teil1 = 6>=2*3;
        teil2 = 2-3<0;
        teil3 = 1*1 == 1;
        teil4 = 1!=1+1;
        boolean ergebnis4;
        ergebnis4 = (teil1 || teil2) && (teil3 && teil4);
        System.out.println("Ergebnis 4: " + ergebnis4);
    }
}
