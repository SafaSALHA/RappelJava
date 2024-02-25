public class TestGestionBanque {
    public static void main(String[] args) {
        Compte c1 = new Compte("salah", 1500);
        Compte c2 = new Compte("Fatma", 2000);

        /*
         * System.out.println(c1);
         * System.out.println(c2.getTitulaire());
         */

        CompteEpargne c3 = new CompteEpargne("ali", 850, 0.05);
        try {
            c3.debiter(200);
            System.out.println("Le solde restant: " + c3.getSolde());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }

        /*System.out.println("------------------------------------");

        Banque stb = new Banque("STB");
        stb.ajoutCompte(c1);
        stb.ajoutCompte(c2);
        stb.ajoutCompte(c3);

        System.out.println(stb);*/
    }
}
