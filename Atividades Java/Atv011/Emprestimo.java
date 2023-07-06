public class Emprestimo {
    private double valorTotal;
    private int taxaJuros;
    private int numeroParcelas;

    public Emprestimo(double valorTotal, int taxaJuros, int numeroParcelas){
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
    }

    public double getValorTotal(){
        return this.valorTotal;
    }

    public int getTaxaJuros(){
        return this.taxaJuros;
    }
    
    public int getNumeroParcelas(){
        return this.numeroParcelas;
    }

    public int proximaParcela(){
        return 0;
    }

}