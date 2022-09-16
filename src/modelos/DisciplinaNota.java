package modelos;

import java.util.ArrayList;

public class DisciplinaNota {
    private Disciplina disciplina;
    private ArrayList<Double> notas;


    public DisciplinaNota(Disciplina disciplina, ArrayList<Double> notas) {
        this.disciplina = disciplina;
        this.notas = notas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Boletim:" + notas;
    }
}
