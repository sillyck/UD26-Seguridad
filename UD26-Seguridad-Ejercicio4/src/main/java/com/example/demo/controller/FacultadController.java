package com.example.demo.controller;

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

import com.example.demo.dto.Facultad;
import com.example.demo.service.FacultadServiceIMPL;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceIMPL FacultadServiceImpl;
	
	@GetMapping("/Facultad")
	public List<Facultad> listarFacultad(){
		return FacultadServiceImpl.listarFacultads();
	}
	
	
	@PostMapping("/Facultad")
	public Facultad salvarFacultad(@RequestBody Facultad Facultad) {
		
		return FacultadServiceImpl.guardarFacultad(Facultad);
	}
	
	
	@GetMapping("/Facultad/{id}")
	public Facultad FacultadXID(@PathVariable(name="id") int id) {
		
		Facultad Facultad_xid= new Facultad();
		
		Facultad_xid=FacultadServiceImpl.FacultadXID(id);
		
		System.out.println("Facultad XID: "+Facultad_xid);
		
		return Facultad_xid;
	}
	
	@PutMapping("/Facultad/{id}")
	public Facultad actualizarFacultad(@PathVariable(name="id")int id,@RequestBody Facultad Facultad) {
		
		Facultad Facultad_seleccionado= new Facultad();
		Facultad Facultad_actualizado= new Facultad();
		
		Facultad_seleccionado= FacultadServiceImpl.FacultadXID(id);
		
		
		Facultad_seleccionado.setNombre(Facultad.getNombre());

		Facultad_actualizado = FacultadServiceImpl.actualizarFacultad(Facultad_seleccionado);
		
		System.out.println("El Facultad actualizado es: "+ Facultad_actualizado);
		
		return Facultad_actualizado;
	}
	
	@DeleteMapping("/Facultad/{id}")
	public void eleiminarFacultad(@PathVariable(name="id")int id) {
		FacultadServiceImpl.eliminarFacultad(id);
	}
	
}
