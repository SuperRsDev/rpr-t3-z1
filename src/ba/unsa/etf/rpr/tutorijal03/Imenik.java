package ba.unsa.etf.rpr.tutorijal03;

import ba.unsa.etf.rpr.tutorijal03.Enum.Grad;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;
    public  Imenik() {
        this.imenik = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        return MapHelper.getKeyByValue(imenik, broj);
    }

    public String naSlovo(char s) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        List<String> imena = imenik.entrySet()
                .stream()
                .filter(entry -> entry.getKey().indexOf(s) >= 0)
                .map(m -> {
                    int index = atomicInteger.getAndIncrement() + 1;
                    return String.format("%s. %s - %s",index, m.getKey(), m.getValue().ispisi());
                })
                .collect(Collectors.toList());
        return String.join("\n", imena);
    }

    public Set<String> izGrada(Grad g) {
        List<String> imena = imenik.entrySet()
                .stream()
                .filter(entry -> entry.getValue() instanceof FiksniBroj && ((FiksniBroj)entry.getValue()).getGrad() == g)
                .map(m -> m.getKey())
                .collect(Collectors.toList());
        return null;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad sarajevo) {
        return null;
    }
}
