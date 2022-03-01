package main.service;

import java.util.List;

import main.dto.Cientifico;

public interface ICientificoService {
	
	public List<Cientifico> listarCientifico();
	
	public Cientifico cientificoXID(String id);
	
	public Cientifico guardarCientifico(Cientifico cientifico);	
		
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(String id);

}
