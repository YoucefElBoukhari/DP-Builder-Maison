class ConstructeurMaisonBois implements ConstructeurMaison {
    private Maison maison = new Maison();

    public void construireSousSol() {
        maison.setSousSol("Petit sous-sol");
    }

    public void construireMurs() {
        maison.setMurs("Murs en bois");
    }

    public void construireToit() {
        maison.setToit("Toit en bois");
    }

    public void construireInterieur() {
        maison.setInterieur("Intérieur traditionnel");
    }

    public Maison obtenirMaison() {
        return maison;
    }
}
