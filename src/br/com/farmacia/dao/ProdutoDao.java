package br.com.farmacia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao {
    private Connection conn;
    public ProdutoDao(Connection connection){
        this.conn = connection;
    }

    public void insert(int id, double preco, String nome, String fabricante){
        String sql = "INSERT INTO produto(id, preco, nome, fabricante) VALUES(?,?,?,?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.setDouble(2, preco);
            preparedStatement.setString(3, nome);
            preparedStatement.setString(4, fabricante);
            preparedStatement.execute();
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
