package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IProyectoDao;
import main.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDao iProyectoDao;

	@Override
	public List<Proyecto> listarProyecto() {
		
		return iProyectoDao.findAll();
	}
	
	@Override
	public Proyecto proyectoXID(Character id) {
		
		return iProyectoDao.findById(id).get();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		
		return iProyectoDao.save(proyecto);
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		
		return iProyectoDao.save(proyecto);
	}

	@Override
	public void eliminarProyecto(Character id) {
		
		iProyectoDao.deleteById(id);
	}
}
