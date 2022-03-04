package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadoresDAO;
import com.example.demo.dto.Investigadores;


@Service
public class InvestigadoresServiceIMPL implements IInvestigadoresService{

	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigadores(Investigadores Investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(Investigadores);
	}

	@Override
	public Investigadores InvestigadoresXID(int id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigadores(Investigadores Investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(Investigadores);
	}

	@Override
	public void eliminarInvestigadores(int id) {
		// TODO Auto-generated method stub
		iInvestigadoresDAO.deleteById(id);
	}
	
}
