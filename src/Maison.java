class Maison {
    private String sousSol;
    private String murs;
    private String toit;
    private String interieur;

    public void setSousSol(String sousSol) {
        this.sousSol = sousSol;
    }

    public void setMurs(String murs) {
        this.murs = murs;
    }

    public void setToit(String toit) {
        this.toit = toit;
    }

    public void setInterieur(String interieur) {
        this.interieur = interieur;
    }

    @Override
    public String toString() {
        return "Maison{" +
                "sousSol='" + sousSol + '\'' +
                ", murs='" + murs + '\'' +
                ", toit='" + toit + '\'' +
                ", interieur='" + interieur + '\'' +
                '}';
    }
}
