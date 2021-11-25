package com.birt.berton.BertonRestAPI_PROY_1C.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.berton.BertonRestAPI_PROY_1C.DAO.CasasRuralesDAO;

import com.birt.berton.BertonRestAPI_PROY_1C.models.CasaRural;


@Service
public class CasaRuralServiceImpl implements CasaRuralService {
	@Autowired
	private CasasRuralesDAO casasRuralesRepository;

	@Override
	public List<CasaRural> findAll() {
		return casasRuralesRepository.findAll();
	}

	@Override
	public List<CasaRural> findByPropertiesLodgingtype(String type) {
		return casasRuralesRepository.findByPropertiesLodgingtype(type);
	}
}
