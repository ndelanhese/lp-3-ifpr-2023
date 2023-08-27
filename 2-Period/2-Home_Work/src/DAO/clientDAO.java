package DAO;

import controller.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.client;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class clientDAO {

    public int inserir(client u) throws Exception {
        int retorno;

        String sql = "insert into client (name, clientType, cpfcnpj, phone, email, observation, creation_date)"
                + "values (?, ?, ?, ?, ?, ?, ?)";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            java.util.Date registrationDate = u.getRegistrationDate();
            if (registrationDate == null) {
                registrationDate = new java.util.Date();
            }

            Date sqlDate = new Date(registrationDate.getTime());

            ps.setString(1, u.getName());
            ps.setInt(2, u.getClientType());
            ps.setString(3, u.getCpfCnpj());
            ps.setString(4, u.getPhone());
            ps.setString(5, u.getEmail());
            ps.setString(6, u.getObservation());
            ps.setDate(7, sqlDate);

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<client> buscar(String nome) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from client ";

        if (!nome.equals("")) {
            sql += " where name like ?";
        }

        sql += " order by name";

        List<client> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    client u = new client();
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("name"));
                    u.setClientType(rs.getInt("clientType"));
                    u.setCpfCnpj(rs.getString("cpfcnpj"));
                    u.setPhone(rs.getString("phone"));
                    u.setEmail(rs.getString("email"));
                    u.setObservation(rs.getString("observation"));
                    u.setRegistrationDate(rs.getDate("creation_date"));

                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public client getUsuario(int id) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from client where id = ?";

        client obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new client();
                    obj.setId(rs.getInt("id"));
                    obj.setName(rs.getString("name"));
                    obj.setClientType(rs.getInt("clientType"));
                    obj.setCpfCnpj(rs.getString("cpfcnpj"));
                    obj.setPhone(rs.getString("phone"));
                    obj.setEmail(rs.getString("email"));
                    obj.setObservation(rs.getString("observation"));
                    obj.setRegistrationDate(rs.getDate("creation_date"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(client u) throws Exception {
        int retorno;

        String sql = "update client"
                + "      set name  = ?,"
                + "      set clientType  = ?,"
                + "      set cpfcnpj  = ?,"
                + "      set phone  = ?,"
                + "      set email  = ?,"
                + "      set observation  = ?"
                + "    where id    = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getName());
            ps.setInt(2, u.getClientType());
            ps.setString(3, u.getCpfCnpj());
            ps.setString(4, u.getPhone());
            ps.setString(5, u.getEmail());
            ps.setString(6, u.getObservation());
            ps.setInt(7, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from client where id = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

}
