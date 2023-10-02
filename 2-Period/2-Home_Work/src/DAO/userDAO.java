package DAO;

import controller.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.user;
import models.userGroup;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class userDAO {

    public int inserir(user userData) throws Exception {

        String sql = "insert into user (name, email, password, creation_date, status, usergroup_id) "
                + "values (?, ?, ?, ?, ?, ?)";

        Connection con = connection.getConexao();

        if (con.isClosed()) {
            throw new Exception("Connection is closed");
        }

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            java.util.Date registrationDate = userData.getDateRegistration();
            if (registrationDate == null) {
                registrationDate = new java.util.Date();
            }

            Date sqlDate = new Date(registrationDate.getTime());

            int groupId = userData.getGroupFromUser().getId();

            ps.setString(1, userData.getNome());
            ps.setString(2, userData.getEmail());
            ps.setString(3, userData.getSenha());
            ps.setDate(4, sqlDate);
            ps.setInt(5, userData.getStatus());
            ps.setInt(6, groupId);

            return ps.executeUpdate();
        }
    }

    public List<user> buscar(String nome) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from user ";

        if (!nome.equals("")) {
            sql += " where name like ?";
        }

        sql += " order by name";

        List<user> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    user u = new user();
                    u.setId(rs.getInt("id"));
                    u.setNome(rs.getString("name"));
                    u.setEmail(rs.getString("email"));
                    u.setDateRegistration(rs.getDate("creation_date"));
                    u.setStatus(rs.getInt("status"));
                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }
        return lista;
    }

    public user getUsuario(int id) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from user where id = ?";

        user userData = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    userData = new user();
                    userData.setId(rs.getInt("id"));
                    userData.setNome(rs.getString("name"));
                    userData.setEmail(rs.getString("email"));
                    userData.setDateRegistration(rs.getDate("creation_date"));
                    userData.setStatus(rs.getInt("status"));

                    Integer userGroupId = rs.getInt("usergroup_id");

                    if (userGroupId != null && userGroupId > 0) {
                        userGroup userGroupData = getUserGroupById(userGroupId);
                        userData.setGroupFromUser(userGroupData);
                    }

                }
            }
        } catch (Exception e) {
            throw e;
        }
        return userData;
    }

    public int atualizar(user userData) throws Exception {
        int retorno;

        String sql = "update user"
                + "      set name  = ?,"
                + "          email = ?,"
                + "          status = ?,"
                + "          usergroup_id = ?"
                + "    where id    = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, userData.getNome());
            ps.setString(2, userData.getEmail());
            ps.setInt(3, userData.getStatus());
            ps.setInt(4, userData.getGroupFromUser().getId());
            ps.setInt(5, userData.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from user where id = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    public userGroup getUserGroupById(Integer id) throws Exception {
        String query = "select * from usergroup where id = ?";

        userGroup userGroupData = null;

        Connection con = connection.getConexao();

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    userGroupData = new userGroup();
                    userGroupData.setId(rs.getInt("id"));
                    userGroupData.setName(rs.getString("name"));

                }
            }
        } catch (Exception e) {
            throw e;
        }
        return userGroupData;
    }

}
