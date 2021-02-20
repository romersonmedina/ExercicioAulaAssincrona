package exercicioAulaAssincrona;

public class GerenteImediato extends Funcionario {

    public GerenteImediato(boolean disponivel) {
        super(disponivel);
    }

    @Override
    public void aprovaPagamento(double pagamento) {
        if (!this.disponivel){
            System.out.println("Gerente Imediato não disponível.");
            return;
         }
        if (pagamento <= 500){
            System.out.println("Pagamento Aprovado por Gerente Imediato!");
            return;

        }
        System.out.println("Gerente Imediato não aprova este tipo de pagamento!");

    }
}
