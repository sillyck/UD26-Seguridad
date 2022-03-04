package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

@Service
public class FacultadServiceIMPL implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultad> listarFacultads() {
		// TODO Auto-generated method stub
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad Facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(Facultad);
	}

	@Override
	public Facultad FacultadXID(int id) {
		// TODO Auto-generated method stub
		return iFacultadDAO.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad Facultad) {
		// TODO Auto-generated method stub
		return iFacultadDAO.save(Facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		// TODO Auto-generated method stub
		iFacultadDAO.deleteById(id);
	}
	
}
