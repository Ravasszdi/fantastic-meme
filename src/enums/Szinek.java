package enums;

public enum Szinek {
    RESET("\u001b[0m"),
    PIROS("\u001b[31m"),
    ZOLD("\u001b[32m"),
    KEK("\u001b[34m");

    private final String szinKod;

    private Szinek(String szinKod) {
        this.szinKod = szinKod;
    }

    public String getSzinKod() {
        return this.szinKod;
    }

    @Override
    public String toString() {
        switch (this) {
            default:
                return "Fekete";
            case PIROS:
                return "Piros";
            case ZOLD:
                return "Zöld";
            case KEK:
                return "Kék-";
        }
    }

}
