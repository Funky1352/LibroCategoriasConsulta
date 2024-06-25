package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Curso;


public interface CursoService {

	//CRUD
	public abstract Curso agregarActualizarCurso(Curso curso);
	public abstract void eliminarCurso(int id);
	public abstract Curso buscaCursoPorPK(int idCurso);
	public abstract List<Curso> listaCursoPorNombre(String nombre);

	//Consultas
	public abstract List<Curso> listaCursoPorIDCursoYNombre(int idCurso, String nombre);
	
	
}
