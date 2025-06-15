package roteiro7.parte1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//Criando um vetor estático de objetos Aluno
        Scanner entrada = new Scanner(System.in);

        Aluno[] listaAlunos = new Aluno[3];

        for(int i = 0; i < listaAlunos.length; i++){
            
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
            listaAlunos[i] = aluno;

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
        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("Nome: " + listaAlunos[i].getNome());
            System.out.println("Curso: " + listaAlunos[i].getCurso());
            System.out.println("Matricula: "  + listaAlunos[i].getMatricula());
            System.out.println("Ano Ingresso: " + listaAlunos[i].getAnoIngresso());
            System.out.println("********************************");
        }
    }
}