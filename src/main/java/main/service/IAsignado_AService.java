package main.service;

import java.util.List;

import main.dto.Asignado_A;

public interface IAsignado_AService {	

	public List<Asignado_A> listarAsignado_A();
	
	public Asignado_A asignado_AXID(Integer id);

	public Asignado_A guardarAsignado_A(Asignado_A asignado_A);	

	public Asignado_A actualizarAsignado_A(Asignado_A asignado_A);

	public void eliminarAsignado_A(Integer id);
}
