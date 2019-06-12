package ba.unsa.etf.rpr.tutorijal03;

public abstract class TelefonskiBroj {
    public abstract String ispisi();
    public abstract int hashCode();
}


/*
* return new HashCodeBuilder(17, 37).
        append(id).
        append(name).
        append(email).
        toHashCode();


            int result = (int) (id ^ (id >>> 32));
    result = 31 * result + name.hashCode();
    result = 31 * result + email.hashCode();
    return result;
* */