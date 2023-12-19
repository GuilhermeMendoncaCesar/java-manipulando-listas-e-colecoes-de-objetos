import menu.Compras;
import modelos.CartaoDeCredito;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double limite = teclado.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        int resposta = 1;
        while (resposta != 0){
            System.out.println("Digite a descrição da compra:");
            String descricao = teclado.next();
            System.out.println("Digite o valor da compra:");
            double valor = teclado.nextDouble();
            Compras compra = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);
            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                resposta = teclado.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                resposta = 0;
            }
        }
        System.out.println("****************");
        System.out.println("Compras realizadas:\n");
        List<Compras> listaDeCompras = cartao.getCompras();
        Collections.sort(listaDeCompras);
        for (Compras compras:listaDeCompras){
            System.out.println(compras.getDescricao() + " - " + compras.getValor());
        }
        System.out.println("\n****************\n");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());

    }
}