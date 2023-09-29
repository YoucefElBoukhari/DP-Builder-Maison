class ConstructeurMaisonNormale implements ConstructeurMaison {
    private Maison maison = new Maison();

    public void construireSousSol() {
        maison.setSousSol("Petit sous-sol");
    }

    public void construireMurs() {
        maison.setMurs("Murs en briques");
    }

    public void construireToit() {
        maison.setToit("Toit en ciment");
    }

    public void construireInterieur() {
        maison.setInterieur("Intérieur conventionnel");
    }

    public Maison obtenirMaison() {
        return maison;
    }
}