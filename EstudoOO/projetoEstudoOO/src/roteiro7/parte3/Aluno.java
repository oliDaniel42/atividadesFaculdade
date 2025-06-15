package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private ArrayList<String> disciplinas;

    Aluno(String pNome, String pCurso, int pMatricula, int pAnoIngresso) {
        nome = pNome;
        curso = pCurso;
        matricula = pMatricula;
        anoIngresso = pAnoIngresso;
        disciplinas = new ArrayList<>();
        }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<String> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoIngresso(){
        return anoIngresso;
    }

    public String getCurso() {
        // TODO Auto-generated method stub
        return this.curso;
    }
}