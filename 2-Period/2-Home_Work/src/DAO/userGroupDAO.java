package DAO;

import controller.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.userGroup;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class userGroupDAO {

    public int inserir(userGroup u) throws Exception {
        int retorno;

        String sql = "insert into usergroup (name)"
                + "values (?)";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, u.getName());
            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<userGroup> buscar(String nome) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from usergroup ";

        if (!nome.equals("")) {
            sql += " where name like ?";
        }

        sql += " order by name";

        List<userGroup> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    userGroup u = new userGroup();
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("name"));
                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public userGroup getUsuario(int id) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from usergroup where id = ?";

        userGroup obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new userGroup();
                    obj.setId(rs.getInt("id"));
                    obj.setName(rs.getString("name"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(userGroup u) throws Exception {
        int retorno;

        String sql = "update usergroup"
                + "      set name  = ?"
                + "    where id    = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getName());
            ps.setInt(2, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from usergroup where id = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

}
