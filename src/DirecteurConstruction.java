class DirecteurConstruction {
    public void construireMaison(ConstructeurMaison constructeur) {
        constructeur.construireSousSol();
        constructeur.construireMurs();
        constructeur.construireToit();
        constructeur.construireInterieur();
    }
}