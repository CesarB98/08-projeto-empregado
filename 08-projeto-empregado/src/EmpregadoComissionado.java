public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(String nome, long matricula, double totalDeVendas, double comissao) {
        super(nome, matricula);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
    public String toString (){
        return super.toString() + " -- " + totalDeVendas + " -- " + comissao;
    }

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }
}
