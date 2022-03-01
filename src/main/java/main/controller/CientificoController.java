package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Cientifico;
import main.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;

	@GetMapping("/cientificos")
	public List<Cientifico> listarCientifico() {
		return cientificoServiceImpl.listarCientifico();
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name = "id") String dni) {

		Cientifico cientifico_xid = new Cientifico();

		cientifico_xid = cientificoServiceImpl.cientificoXID(dni);

		System.out.println("Cientifico XID: " + cientifico_xid);

		return cientifico_xid;
	}

	@PostMapping("/cientificos")
	public Cientifico salvarCientifico(@RequestBody Cientifico cientifico) {

		return cientificoServiceImpl.guardarCientifico(cientifico);
	}

	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") String dni, @RequestBody Cientifico cientifico) {

		Cientifico cientifico_seleccionado = new Cientifico();
		Cientifico cientifico_actualizado = new Cientifico();

		cientifico_seleccionado = cientificoServiceImpl.cientificoXID(dni);

		cientifico_seleccionado.setNomApels(cientifico.getNomApels());

		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);

		System.out.println("El cientifico actualizado es: " + cientifico_actualizado);

		return cientifico_actualizado;
	}

	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") String dni) {
		cientificoServiceImpl.eliminarCientifico(dni);
	}
}
