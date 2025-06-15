package roteiro7.parte1;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    Aluno(String pNome, String pCurso, int pMatricula, int pAnoIngresso){
        nome = pNome;
        curso = pCurso;
        matricula = pMatricula;
        anoIngresso = pAnoIngresso;
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