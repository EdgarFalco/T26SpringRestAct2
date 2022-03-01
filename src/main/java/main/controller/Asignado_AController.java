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

import main.dto.Asignado_A;
import main.service.Asignado_AServiceImpl;

@RestController
@RequestMapping("/api")
public class Asignado_AController {

	@Autowired
	Asignado_AServiceImpl asignado_AServiceImpl;

	@GetMapping("/asignado_A")
	public List<Asignado_A> listarAsignado_A() {
		return asignado_AServiceImpl.listarAsignado_A();
	}

	@GetMapping("/asignado_A/{id}")
	public Asignado_A asignado_AXID(@PathVariable(name = "id") Integer id) {

		Asignado_A asignado_A_xid = new Asignado_A();

		asignado_A_xid = asignado_AServiceImpl.asignado_AXID(id);

		System.out.println("Asignado_A XID: " + asignado_A_xid);

		return asignado_A_xid;
	}

	@PostMapping("/asignado_A")
	public Asignado_A salvarAsignado_A(@RequestBody Asignado_A asignado_A) {

		return asignado_AServiceImpl.guardarAsignado_A(asignado_A);
	}

	@PutMapping("/asignado_A/{id}")
	public Asignado_A actualizarAsignado_A(@PathVariable(name = "id") Integer id, @RequestBody Asignado_A asignado_A) {

		Asignado_A asignado_A_seleccionado = new Asignado_A();
		Asignado_A asignado_A_actualizado = new Asignado_A();

		asignado_A_seleccionado = asignado_AServiceImpl.asignado_AXID(id);

		asignado_A_seleccionado.setCientifico(asignado_A.getCientifico());
		asignado_A_seleccionado.setProyecto(asignado_A.getProyecto());

		asignado_A_actualizado = asignado_AServiceImpl.actualizarAsignado_A(asignado_A_seleccionado);

		System.out.println("Asignado_A actualizado es: " + asignado_A_actualizado);

		return asignado_A_actualizado;
	}

	@DeleteMapping("/asignado_A/{id}")
	public void eliminarAsignado_A(@PathVariable(name = "id") Integer id) {
		asignado_AServiceImpl.eliminarAsignado_A(id);
	}
}