package modelos;

import menu.Compras;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compras compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
