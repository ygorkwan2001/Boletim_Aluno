package modelos;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    List<Curso> curso;

    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor(a): " +  getNome()
                ;
    }
}
