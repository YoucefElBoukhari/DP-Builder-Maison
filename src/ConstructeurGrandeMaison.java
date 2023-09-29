class ConstructeurGrandeMaison implements ConstructeurMaison {
    private Maison maison = new Maison();

    public void construireSousSol() {
        maison.setSousSol("Vaste sous-sol");
    }

    public void construireMurs() {
        maison.setMurs("Murs en briques");
    }

    public void construireToit() {
        maison.setToit("Toit en ciment");
    }

    public void construireInterieur() {
        maison.setInterieur("Intérieur de grande qualité et traditionnel");
    }

    public Maison obtenirMaison() {
        return maison;
    }
}