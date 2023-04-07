package user;

import java.sql.Connection;

public class Bdd {
    private void connection() {

        try {
            String url = "jdbc:mysql://localhost:3306/tln_crudutilisateur";
            String utilsateur = "root";
            String mdp = "";
        } catch (Exception e) {
            System.out.println("Erreur");
        }
    }

    public Connection getConnexion() {
        return null;
    }
}
