package br.ufpb.dcx.aps.atividades.atv02;

import java.util.LinkedList;
import java.util.List;


public class Turma {
    private int codigo;
    private List<Aluno> alunos = new LinkedList<Aluno>();
    private Aluno aluno;
    private Professor professor;

    public Turma() {
        this.codigo = 0;
    }
    public Turma(int codTurma){
        this.codigo = codTurma;
    }

    public void addAluno (Aluno aluno){
        this.alunos.add(aluno);
    }

    public int getCodigo() {
        return codigo;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public Aluno getAluno(int matricula) {
        Aluno b = new Aluno();
        if (alunos .isEmpty()){
            b = null;
        }
        for (Aluno c : alunos){
            if (matricula == c.getMatricula()){
                b = c;
            }
        }
        return b;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
