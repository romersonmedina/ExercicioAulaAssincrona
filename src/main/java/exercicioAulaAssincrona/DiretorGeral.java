package exercicioAulaAssincrona;

public class DiretorGeral extends Funcionario{

    public DiretorGeral(boolean disponivel) {
        super(disponivel);
    }

    @Override
    public void aprovaPagamento(double pagamento) {
        if (!this.disponivel){
            System.out.println("Diretor Geral não disponível.");
            return;
        }
        if (pagamento <= 15000){
            System.out.println("Pagamento Aprovado por Diretor Geral!");
            return;
        }
        System.out.println("Diretor Geral não aprova este tipo de pagamento!");

    }
}
