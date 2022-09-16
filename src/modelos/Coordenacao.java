package modelos;

public class Coordenacao {
    private Coordenador coordenador;
    private  Curso curso;

    public Coordenacao(Coordenador coordenador, Curso curso) {
        this.coordenador = coordenador;
        this.curso = curso;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }



    @Override
    public String toString() {
        return "Coordenacao " +
                "coordenador: " + coordenador +
                "curso: " + curso
                ;
    }
}
