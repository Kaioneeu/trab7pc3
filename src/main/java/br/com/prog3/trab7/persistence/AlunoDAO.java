package br.com.prog3.trab7.persistence;

import java.util.List;

import br.com.prog3.trab7.model.Aluno;

public interface AlunoDAO {

	public String save(Aluno aluno);

	public String delete(Aluno aluno);

	public String update(Aluno aluno);

	public List<Aluno> listAll();

	public Aluno findByMatricula(int matricula);

}
