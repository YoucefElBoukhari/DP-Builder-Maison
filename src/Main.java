public class Main {
    public static void main(String[] args) {
        DirecteurConstruction directeur = new DirecteurConstruction();

        // Construire une maison normale.
        ConstructeurMaison constructeurMaisonNormale = new ConstructeurMaisonNormale();
        directeur.construireMaison(constructeurMaisonNormale);
        Maison maisonNormale = constructeurMaisonNormale.obtenirMaison();
        System.out.println("Maison Normale : " + maisonNormale);

        // Construire une maison en bois.
        ConstructeurMaison constructeurMaisonBois = new ConstructeurMaisonBois();
        directeur.construireMaison(constructeurMaisonBois);
        Maison maisonBois = constructeurMaisonBois.obtenirMaison();
        System.out.println("Maison en Bois : " + maisonBois);

        // Construire une grande maison.
        ConstructeurMaison constructeurGrandeMaison = new ConstructeurGrandeMaison();
        directeur.construireMaison(constructeurGrandeMaison);
        Maison grandeMaison = constructeurGrandeMaison.obtenirMaison();
        System.out.println("Grande Maison : " + grandeMaison);
    }
}