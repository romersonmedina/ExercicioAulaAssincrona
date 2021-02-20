package exercicioAulaAssincrona;

public class GerenteGeral extends Funcionario{

    public GerenteGeral(boolean disponivel) {
        super(disponivel);
    }

    @Override
    public void aprovaPagamento(double pagamento) {
        if (!this.disponivel){
            System.out.println("Gerente Geral não disponível.");
            return;
        }
        if (pagamento <= 1500){
            System.out.println("Pagamento Aprovado por Gerente Geral!");
            return;
        }
        System.out.println("Gerente Geral não aprova este tipo de pagamento!");
    }
}
