package DAO;

import controller.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.product;

/**
 *
 * @author Marcelo Rafael Borth
 */
public class productDAO {

    public int inserir(product u) throws Exception {
        int retorno;

        String sql = "insert into product (name, unitOfMeasure, registrationDate)"
                + "values (?, ?, ?)";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {

            java.util.Date registrationDate = u.getRegistrationDate();
            if (registrationDate == null) {
                registrationDate = new java.util.Date();
            }

            Date sqlDate = new Date(registrationDate.getTime());

            ps.setString(1, u.getName());
            ps.setString(2, u.getUnitOfMeasure());
            ps.setDate(3, sqlDate);

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public List<product> buscar(String nome) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from product ";

        if (!nome.equals("")) {
            sql += " where name like ?";
        }

        sql += " order by name";

        List<product> lista = new ArrayList<>();

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            if (!nome.equals("")) {
                ps.setString(1, "%" + nome + "%");
            }

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    product u = new product();
                    u.setId(rs.getInt("id"));
                    u.setName(rs.getString("name"));
                    u.setUnitOfMeasure(rs.getString("unitOfMeasure"));
                    u.setRegistrationDate(rs.getDate("registrationDate"));

                    lista.add(u);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return lista;
    }

    public product getUsuario(int id) throws Exception {
        Connection conexao = connection.getConexao();
        String sql = "select * from product where id = ?";

        product obj = null;

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            //Parâmetros da SQL (pode ser mais de 1 param)
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    obj = new product();
                    obj.setId(rs.getInt("id"));
                    obj.setName(rs.getString("name"));
                    obj.setUnitOfMeasure(rs.getString("unitOfMeasure"));
                    obj.setRegistrationDate(rs.getDate("registrationDate"));
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return obj;
    }

    public int atualizar(product u) throws Exception {
        int retorno;

        String sql = "update product"
                + "      set name  = ?,"
                + "      set unitOfMeasure  = ?"
                + "    where id    = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, u.getName());
            ps.setString(2, u.getUnitOfMeasure());
            ps.setInt(3, u.getId());

            retorno = ps.executeUpdate();
        }

        return retorno;
    }

    public void excluir(Integer id) throws Exception {
        String sql = "delete from product where id = ?";

        Connection conexao = connection.getConexao();
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

}
