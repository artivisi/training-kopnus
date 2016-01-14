package com.artivisi.halo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.artivisi.halo.dao.InstitusiDao;
import com.artivisi.halo.entity.Institusi;

@Controller
public class InstitusiController {
	
	@Autowired private InstitusiDao institusiDao;
	
	@RequestMapping(value="/institusi", method = RequestMethod.GET)
	@ResponseBody
	public Page<Institusi> semua(Pageable pageable){
		return institusiDao.findAll(pageable);
	}
}
