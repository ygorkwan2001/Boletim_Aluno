package modelos;

import enums.Area;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private Area area;
    private List<Curso> cursos;

    public Disciplina(String nome, Area area) {
        this.nome = nome;
        this.area = area;
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome +
                "\nArea: " + area
                ;
    }
}
