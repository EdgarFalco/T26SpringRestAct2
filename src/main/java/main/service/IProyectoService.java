package main.service;

import java.util.List;

import main.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyecto();
	
	public Proyecto proyectoXID(Character id);

	public Proyecto guardarProyecto(Proyecto proyecto);	

	public Proyecto actualizarProyecto(Proyecto proyecto); 

	public void eliminarProyecto(Character id);

}
