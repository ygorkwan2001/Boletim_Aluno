package modelos;

public class Coordenador extends Pessoa{
    private Double salario;

    public Coordenador(String nome, String cpf, String matricula, Double salario) {
        super(nome, cpf, matricula);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }



    @Override
    public String toString() {
        return "Coordenador: " + getNome()
                ;
    }
}
