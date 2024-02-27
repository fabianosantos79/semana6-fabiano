package br.com.farmacia.service;

import br.com.farmacia.dao.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoService {
    private ConnectionFactory connection;
    public ProdutoService(){
        this.connection = new ConnectionFactory();
    }

    public void registerProduct(int id, double preco, String nome, String fabricante){
        String sql = "INSERT INTO produto(id, preco, nome, fabricante) VALUES(?,?,?,?)";
        Connection conn = connection.startConection();

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
