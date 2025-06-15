package roteiro7.parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//Criando um vetor estático de objetos Aluno
        Scanner entrada = new Scanner(System.in);

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        System.out.println("Quantos alunos deseja cadastrar?: ");
        int qtdAlunos = entrada.nextInt();
        entrada.nextLine();

        for(int i = 0; i < qtdAlunos; i++){
            
            System.out.println("Digite seu nome: ");
            String nome = entrada.nextLine();
            
            System.out.println("Digite seu curso: ");
            String curso = entrada.nextLine();
            
            System.out.println("Digite a matricula: ");
            int matricula = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ano de ingresso: ");
            int ano = entrada.nextInt();
            entrada.nextLine();

            Aluno aluno = new Aluno(nome, curso, matricula, ano);
            listaAlunos.add(aluno);

            // Pausa de 1 segundo antes do próximo cadastro
            try {
                Thread.sleep(1000); // 1000 milissegundos = 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        entrada.close();

        System.out.println("Listando os Alunos :");
        System.out.println("********************************");
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Nome: " + listaAlunos.get(i).getNome());
            System.out.println("Curso: " + listaAlunos.get(i).getCurso());
            System.out.println("Matricula: "  + listaAlunos.get(i).getMatricula());
            System.out.println("Ano Ingresso: " + listaAlunos.get(i).getAnoIngresso());
            System.out.println("********************************");
        }
    }
}