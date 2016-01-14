package com.artivisi.halo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.artivisi.halo.dao.InstitusiDao;
import com.artivisi.halo.entity.Institusi;

@RestController
@RequestMapping("/institusi")
public class InstitusiController {
	
	@Autowired private InstitusiDao institusiDao;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public Page<Institusi> semua(Pageable pageable){
		return institusiDao.findAll(pageable);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Institusi cariById(@PathVariable("id") Institusi i){
		return i;
	}
}
