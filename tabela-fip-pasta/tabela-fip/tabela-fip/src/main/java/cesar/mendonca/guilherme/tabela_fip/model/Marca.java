package cesar.mendonca.guilherme.tabela_fip.model;

public class Veiculo {
    private String codigo;
    private String nome;

    public Veiculo(DadosVeiculo dados) {
        this.codigo = dados.codigo();
        this.nome = dados.nome();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cód: " + this.getCodigo() + "  Descrição: " + this.getNome() + "\n";
    }

}
