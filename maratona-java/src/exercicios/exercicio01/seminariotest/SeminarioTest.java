package exercicios.exercicio01.seminariotest;

import exercicios.exercicio01.seminario.Aluno;
import exercicios.exercicio01.seminario.Local;
import exercicios.exercicio01.seminario.Professor;
import exercicios.exercicio01.seminario.Seminario;

public class SeminarioTest {

    public static void main(String[] args) {

        Local local = new Local("São Paulo");
        Aluno aluno = new Aluno("Wendy", 17);
        Professor professor = new Professor("João", "Tecnologia");

        Seminario seminario = new Seminario("Java", aluno, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
