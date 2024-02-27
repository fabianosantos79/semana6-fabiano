import br.com.farmacia.service.ProdutoService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CADASTRAR PRODUTOS
           ProdutoService produtoService = new ProdutoService();
           produtoService.registerProduct(1, 15.00, "Aspirina", "Bayer");
           produtoService.registerProduct(2, 87.50, "Viagra", "Pfizer");
           produtoService.registerProduct(3, 115.50, "Leite UHT", "Nestle");
           produtoService.registerProduct(4, 8.50, "Xarope", "Melagriao");
           produtoService.registerProduct(5, 215.50, "Nebulizador", "Tec Toy");


        //LISTAR PRODUTOS
        //   ProdutoService produtoService = new ProdutoService();
        //   System.out.println("Produtos cadastrados:");
        //   var produtos = produtoService.viewProduct();
        //   produtos.stream().forEach(System.out::println);


        //LISTAR POR ID
        //   ProdutoService produtoService = new ProdutoService();
        //   System.out.println("Produto cadastrado:");
        //   var produto = produtoService.viewProductByID(3);
        //   System.out.println(produto.toString());


        //ALTERAR PREÇO
        //   ProdutoService produtoService = new ProdutoService();
        //   produtoService.updateProduct(1, 150.00);


        //DELETAR PRODUTO
        //   ProdutoService produtoService = new ProdutoService();
        //   produtoService.deleteProduct(4);
        //   System.out.println("Produto excluído!");

    }
}