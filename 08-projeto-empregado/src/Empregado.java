public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String toString(){
        return matricula + " -- " + nome;
    }
    public abstract double calcularSalario();

}
