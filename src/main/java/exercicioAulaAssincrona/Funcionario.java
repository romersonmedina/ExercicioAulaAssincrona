package exercicioAulaAssincrona;

public abstract class Funcionario {

    protected boolean disponivel;

    public Funcionario(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract void aprovaPagamento(double pagamento);
}
