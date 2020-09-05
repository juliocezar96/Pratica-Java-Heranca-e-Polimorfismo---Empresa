package application;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Funcionario> funcionarioList = new ArrayList<>();

        System.out.print("Quantos funcioarios: ");
        int n = scan.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.println("Funcionario #"+i+" dados: ");
            System.out.print("É terceirizado (s/n)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Nome: ");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Horas: ");
            int hora = scan.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = scan.nextDouble();
            if (ch == 's'){
                System.out.print("Despesa adicional : ");
                double despesaAdicional = scan.nextDouble();
                funcionarioList.add(new FuncionarioTerceirizado(nome,hora,valorPorHora,despesaAdicional));
            } else{
                funcionarioList.add(new Funcionario(nome,hora,valorPorHora));
            }

        }
        System.out.println("PAGAMENTOS:");
        for (Funcionario funcionario: funcionarioList) {
            System.out.println(funcionario.getNome()+" - $"+ String.format("%.2f", funcionario.pagamento()));
        }

        scan.close();

    }
}
