package mx.com.metalsa.spx.rest.api.service.info.impl;


import mx.com.metalsa.spx.rest.api.service.InfoService;

import java.util.Date;

public class InfoServiceImpl4 implements InfoService {

	@Override
	public String getInfo() {
		return "Consultant Api is running: Date: " + new Date();
	}

}
