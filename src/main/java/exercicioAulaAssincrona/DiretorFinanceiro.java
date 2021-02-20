package exercicioAulaAssincrona;

public class DiretorFinanceiro extends Funcionario{

    public DiretorFinanceiro(boolean disponivel) {
        super(disponivel);
    }

    @Override
    public void aprovaPagamento(double pagamento) {
        if (!this.disponivel){
            System.out.println("Diretor Financeiro não disponível.");
            return;
        }
        if (pagamento <= 5000){
            System.out.println("Pagamento Aprovado por Diretor Financeiro!");
            return;
        }
        System.out.println("Diretor Financeiro não aprova este tipo de pagamento!");

    }
}
