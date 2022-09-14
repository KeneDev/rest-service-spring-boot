package mx.com.metalsa.spx.rest.api.service.info.impl;


import mx.com.metalsa.spx.rest.api.service.InfoService;

public class InfoServiceImpl3 implements InfoService {

	@Override
	public String getInfo() {
		return "Consultant-Api\nVersion: 1.0.0\nWritten by: Levent Divilioglu";
	}

}
