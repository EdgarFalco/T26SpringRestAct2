package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IAsignado_ADao;
import main.dto.Asignado_A;

@Service
public class Asignado_AServiceImpl implements IAsignado_AService {

	@Autowired
	IAsignado_ADao iAsignado_ADao;

	@Override
	public List<Asignado_A> listarAsignado_A() {
		
		return iAsignado_ADao.findAll();
	}
	
	@Override
	public Asignado_A asignado_AXID(Integer id) {
		
		return iAsignado_ADao.findById(id).get();
	}

	@Override
	public Asignado_A guardarAsignado_A(Asignado_A asignado_A) {
		
		return iAsignado_ADao.save(asignado_A);
	}

	@Override
	public Asignado_A actualizarAsignado_A(Asignado_A asignado_A) {
		
		return iAsignado_ADao.save(asignado_A);
	}

	@Override
	public void eliminarAsignado_A(Integer id) {
		
		iAsignado_ADao.deleteById(id);
	}

}
