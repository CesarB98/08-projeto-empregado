public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(String nome, long matricula, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(nome, matricula);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public String toString(){
        return super.toString() + " -- " + totalDeHorasTrabalhadas + " -- " + valorDaHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;

    }

}
