package tests;

import DAO.userDAO;
import models.user;

/**
 *
 * @author Marcelo Borth
 */
public class insertUser {

    //DAO - Data Access Object
    public static void main(String[] args) {

        try {
            user u = new user(
                    null, "Marcelo Borth",
                    "marcelo.borth@ifpr.edu.br", "1234");
            
            userDAO dao = new userDAO();
            dao.inserir(u);
            
            System.out.println("Usuário inserido com sucesso.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
