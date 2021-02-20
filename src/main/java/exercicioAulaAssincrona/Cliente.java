package exercicioAulaAssincrona;

public class Cliente {

    public static void main (String args[]){

        double pagamento = 3000;

        GerenteImediato gerenteImediato = new GerenteImediato(true);
        GerenteGeral gerenteGeral = new GerenteGeral(true);
        DiretorFinanceiro diretorFinanceiro = new DiretorFinanceiro(true);
        DiretorGeral diretorGeral = new DiretorGeral(true);

       gerenteImediato.aprovaPagamento(pagamento);
       gerenteGeral.aprovaPagamento(pagamento);
       diretorFinanceiro.aprovaPagamento(pagamento);
       diretorGeral.aprovaPagamento(pagamento);


    }
}
