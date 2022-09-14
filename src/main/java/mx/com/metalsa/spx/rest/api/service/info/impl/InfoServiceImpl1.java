package mx.com.metalsa.spx.rest.api.service.info.impl;


import mx.com.metalsa.spx.rest.api.service.InfoService;

public class InfoServiceImpl1 implements InfoService {

	@Override
	public String getInfo() {
		return "Consultant-Api version 1 is up and running.";
	}

}
