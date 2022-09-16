package modelos;

import java.util.ArrayList;

public class Boletim {
    private Aluno aluno;
    private ArrayList<DisciplinaNota> notasDisciplina;

    public Boletim(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<DisciplinaNota> getNotasDisciplina() {
        return notasDisciplina;
    }

    public void setNotasDisciplina(ArrayList<DisciplinaNota> notasDisciplina) {
        this.notasDisciplina = notasDisciplina;
    }

    @Override
    public String toString() {
        return "Boletim: " +getNotasDisciplina();
    }
}
