package br.com.farmacia.service;

import br.com.farmacia.dao.ConnectionFactory;
import br.com.farmacia.dao.ProdutoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoService {
    private ConnectionFactory connection;
    public ProdutoService(){
        this.connection = new ConnectionFactory();
    }

    public void registerProduct(int id, double preco, String nome, String fabricante){
        Connection conn = connection.startConection();
        new ProdutoDao(conn).insert(id, preco, nome, fabricante);
    }
}
