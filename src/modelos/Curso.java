package modelos;

import enums.Area;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Area area;
    private List<Disciplina> disciplinas;
    private List<Professor> professor;
    private List<Aluno> alunos;

    public Curso(String nome, Area area, List<Disciplina> disciplinas, List<Professor> professor, List<Aluno> alunos) {
        this.nome = nome;
        this.area = area;
        this.disciplinas = disciplinas;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso: " + nome;
    }
}
