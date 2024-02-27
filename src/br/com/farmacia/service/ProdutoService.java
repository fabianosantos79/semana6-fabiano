package br.com.farmacia.service;

import br.com.farmacia.dao.ConnectionFactory;
import br.com.farmacia.dao.ProdutoDao;
import br.com.farmacia.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProdutoService {
    private ConnectionFactory connection;
    public ProdutoService(){
        this.connection = new ConnectionFactory();
    }

    public void registerProduct(int id, double preco, String nome, String fabricante){
        Connection conn = connection.startConection();
        new ProdutoDao(conn).insert(id, preco, nome, fabricante);
    }

//    private Set<Produto> products = new HashSet<>();
    public Set<Produto> viewProduct(){
        Connection conn = connection.startConection();
        return new ProdutoDao(conn).viewList();
    }
}