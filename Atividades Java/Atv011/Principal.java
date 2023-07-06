public class Principal {
    public static void main(String[] args) {
        // CRIA AS VARIÁVEIS
        Emprestimo emp1;
        Emprestimo emp2;
        
        // INSTANCIA OS OBJETOS
        emp1 = new Emprestimo(100, 10, 10);
        emp2 = new Emprestimo(200, 10, 5);

        // RECUPERA O VALOR TOTAL DO EMPRÉSTIMO
        double vt_emp1 = emp1.getValorTotal();
        double vt_emp2 = emp2.getValorTotal();

        // RECUPERA O TAXA DE JUROS DO EMPRÉSTIMO
        int tj_emp1 = emp1.getTaxaJuros();
        int tj_emp2 = emp2.getTaxaJuros();

        // APLICA A TAXA DE JUROS AO VALOR TOTAL
        vt_emp1 += vt_emp1 * tj_emp1/100;
        vt_emp2 += vt_emp2 * tj_emp2/100;

        // RECUPERA O NÚMERO DE PARCELAS DO EMPRÉSTIMO
        int np_emp1 = emp1.getNumeroParcelas();
        int np_emp2 = emp2.getNumeroParcelas();

        // CRIA OS CONTADORES
        int contador1 = np_emp1;
        int contador2 = np_emp2;

        for (int i = 0; i < Math.max(np_emp1, np_emp2); i++) {
            // INDICA O NÚMERO DA PARCELA
            System.out.println(String.format("Parcela %d:", i+1));

            // VERIFICA SE EXISTE PARCELAS DO EMPRÉSTIMO 1
            if(contador1>0)
            // CASO TENHA, IMPRIME A PARCELA
            System.out.println(String.format("Parcela empréstimo 1: R$%.2f", vt_emp1/np_emp1));
            else
            // CASO NÃO TENHA MAIS, IMPRIME -1
            System.out.println(String.format("Parcela empréstimo 1: %d", -1));

            // VERIFICA SE EXISTE PARCELAS DO EMPRÉSTIMO 2
            if(contador2>0)
            // CASO TENHA, IMPRIME A PARCELA
            System.out.println(String.format("Parcela empréstimo 2: R$%.2f", vt_emp2/np_emp2));
            // CASO NÃO TENHA MAIS, IMPRIME -1
            else
            System.out.println(String.format("Parcela empréstimo 2: %d", -1));

            // DECREMENTA A VARIÁVEL, REPRESENTANDO O NÚMERO DE PARCELAS APRESENTADAS
            contador1--;
            contador2--;
        }
    }
}