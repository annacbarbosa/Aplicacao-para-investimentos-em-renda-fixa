public class LCA extends RendaFixa {
  private double juros;
    public LCA(String nome, String cpf, String banco) {
        super(nome, cpf, banco);
      this.juros = 1.05;
      
    }

    @Override
    public double calcularRendimento(double valorInvestido, int tempoMeses, double taxaSelic) 
  {    
        juros*= (taxaSelic/100)/12;
        double rendimento = (valorInvestido * Math.pow((juros+1), tempoMeses));
        return rendimento;
    }
}
