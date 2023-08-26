package tests;

import controller.userDAO;
import models.user;

public class findUser {

    public static void main(String[] args) throws Exception {
        userDAO dao = new userDAO();
        user u = dao.getUsuario(1);
        
        System.out.println("Nome: " + u.getNome());
        System.out.println("Email: " + u.getEmail());
    }
}
