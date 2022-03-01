package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ICientificoDao;
import main.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDao iCientificoDao;

	@Override
	public List<Cientifico> listarCientifico() {
		
		return iCientificoDao.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		
		return iCientificoDao.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String id) {
		
		return iCientificoDao.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		
		return iCientificoDao.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		
		iCientificoDao.deleteById(dni);
	}

}
