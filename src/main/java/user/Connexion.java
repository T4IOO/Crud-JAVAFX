package user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connexion {


    private String mail;

    public void setMail(String mail) {
        String mailbizarre = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if(mail.matches(mailbizarre)) {
            this.mail = mail;
        } else {
            throw new IllegalArgumentException("Adresse e-mail invalide");

        }
    }

    public String seConnecter(String email, String mdp) throws Exception {
        Bdd bdd = null;
        PreparedStatement requete = bdd.getConnexion().prepareStatement("SELECT * FROM user WHERE email=? AND mdp=?");
        requete.setString(1, email);
        requete.setString(2, mdp);
        ResultSet resultats = requete.executeQuery();
        resultats.next();
        return resultats.getString(1);
    }
}