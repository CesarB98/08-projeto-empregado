//import - importa classe
//import static - importa método

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;

public class Util {
    private Controls controle = new Controls();


    public void menu() {
        String aux = "1. Cadastrar empregado\n2. Pesquisar empregado\n3. Listar\n4. Finalizar";
        int opcao;

        while(true){
            //laço de repetição infinito
            opcao = parseInt(showInputDialog(aux));
            switch (opcao){
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    return;
                default:
                    showMessageDialog(null,"Opção inválida");
            }
        }
    }

    private void listar() {
        showInputDialog(null, controle.listar());
    }

    private void pesquisar() {
        long matricula = parseLong(showInputDialog("Matrícula"));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado == null){
            showInputDialog(null, "Empregado não encontrado");
        }else {
            showInputDialog(null, empregado);
        }
    }

    private void cadastrar() {
        //variaveis dos dois tipos de empregados
        long matricula=0;
        String nome = null;
        int totalDeHorasTrabalhadas;
        double valorDaHora;
        double totalDeVendas, comissao;

        String aux = "1. Empregado Horista\n2. Empregado Comissionado\n3. Sair";
        int opcao;

        Empregado empregado;

        while(true){
            opcao = parseInt(showInputDialog(aux));
            if (opcao == 3){return;}
            if (opcao == 1 || opcao == 2){
                matricula = parseLong(showInputDialog("Matrícula"));
                nome = showInputDialog("Nome");
            }
            if (opcao == 1){
                totalDeHorasTrabalhadas = parseInt(showInputDialog("Total de horas trabalhadas"));
                valorDaHora = parseDouble(showInputDialog("Valor da hora trabalhada"));
                empregado = new EmpregadoHorista(nome,matricula,totalDeHorasTrabalhadas,valorDaHora);
                controle.inserir(empregado);
            }else if (opcao == 2){
                totalDeVendas = parseDouble(showInputDialog("Total de Vendas"));
                comissao = parseDouble(showInputDialog("Porcentagem de comissão"));
                empregado = new EmpregadoComissionado(nome,matricula,totalDeVendas,comissao);
                controle.inserir(empregado);
            } else {
                showInputDialog(null,"Opção inválida");
            }

        }

    }

}
