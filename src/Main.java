import br.com.farmacia.service.ProdutoService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... x) {

        ProdutoService produtoService = new ProdutoService();
        produtoService.registerProduct(1, 15.00, "Camiseta", "Lupo");
    }
}