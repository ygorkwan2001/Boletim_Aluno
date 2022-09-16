package modelos;

public class Aluno extends Pessoa{

    private Curso curso;
    private Boletim boletim;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Boletim getBoletim() {
        return boletim;
    }

    public void setBoletim(Boletim boletim) {
        this.boletim = boletim;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() +
                " cpf: " + getCpf() +
                " matricula: " + getMatricula() ;
    }
}
