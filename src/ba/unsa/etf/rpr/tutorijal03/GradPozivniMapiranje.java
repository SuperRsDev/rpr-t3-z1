package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.Enum.Grad;

import java.util.HashMap;

public class GradPozivniMapiranje {
    public static HashMap<Grad, String> getMapiranje() {
        HashMap<Grad, String> mapiranje = new HashMap<>();

        mapiranje.put(Grad.BUGOJNO, "030");
        mapiranje.put(Grad.ORASJE, "031");
        mapiranje.put(Grad.ZENICA, "032");
        mapiranje.put(Grad.SARAJEVO, "033");
        mapiranje.put(Grad.LIVNO, "034");
        mapiranje.put(Grad.TUZLA, "035");
        mapiranje.put(Grad.MOSTAR, "036");
        mapiranje.put(Grad.BIHAC, "037");
        mapiranje.put(Grad.GORAZDE, "038");
        mapiranje.put(Grad.POSUSJE, "039");

        mapiranje.put(Grad.BRCKO, "049");

        mapiranje.put(Grad.MRKONJIC, "050");
        mapiranje.put(Grad.BANJA_LUKA, "051");
        mapiranje.put(Grad.PRIJEDOR, "052");
        mapiranje.put(Grad.DOBOJ, "053");
        mapiranje.put(Grad.SAMAC, "054");
        mapiranje.put(Grad.BIJELJINA, "055");
        mapiranje.put(Grad.ZVORNIK, "056");
        mapiranje.put(Grad.PALE, "057");
        mapiranje.put(Grad.FOCA, "058");
        mapiranje.put(Grad.TREBINJE, "059");
        return mapiranje;
    }
}
