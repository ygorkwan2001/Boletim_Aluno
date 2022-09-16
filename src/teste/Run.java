package teste;

import enums.Area;
import modelos.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Coordenador co1 = new Coordenador("Marcos","15155515","20224789",1500.0);
        Curso curso1 = new Curso("Ciencias da Computacao", Area.EXATAS,
                Arrays.asList(new Disciplina("POO",Area.EXATAS)),
                Arrays.asList(new Professor("Carlos","5115815551","202265885")),
                        Arrays.asList(new Aluno("Joao","1415815858","2022859634")));

        List<Curso> cursos = new ArrayList<>();
        Coordenacao cord1 = new Coordenacao(co1,curso1);
        Aluno a1 = curso1.getAlunos().get(0);
        a1.setCurso(curso1);
        Professor pf1 = curso1.getProfessor().get(0);
        pf1.setCurso(cursos);
        pf1.getCurso().add(curso1);
        Disciplina disc1 = curso1.getDisciplinas().get(0);
        disc1.setCursos(cursos);
        disc1.getCursos().add(curso1);
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(5.0);
        DisciplinaNota dn = new DisciplinaNota(disc1,notas);
        ArrayList<DisciplinaNota> dnot = new ArrayList<>();
        dnot.add(dn);
        Boletim bn = new Boletim(a1);
        bn.setNotasDisciplina(dnot);
        a1.setBoletim(bn);

        System.out.println(curso1.toString());
        System.out.println(co1.toString());
        System.out.println(a1.toString());
        System.out.println(disc1.toString());
        System.out.println(pf1.toString());
        for (int i = 0; i < dnot.size(); i++) {
            System.out.println(bn.getNotasDisciplina().get(i));
        }
    }
}
