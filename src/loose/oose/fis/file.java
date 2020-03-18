import loose.oose.fis.processors.Procesor;
import loose.oose.fis.processors.ProcesorCautare;
import loose.oose.fis.processors.ProcesorCompus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] xmlList = new String[6];
        xmlList[0] = "<tag1>";
         ProcesorCompus pc1 = new ProcesorCompus();
        pc1.adaugaProcesor(c1);
        pc1.adaugaProcesor(c2);

        ProcesorCompus pc2 = new ProcesorCompus();
        pc2.adaugaProcesor(pc1);
        pc2.adaugaProcesor(c3);

        System.out.println(pc2.proceseaza(documente));
    }
}
