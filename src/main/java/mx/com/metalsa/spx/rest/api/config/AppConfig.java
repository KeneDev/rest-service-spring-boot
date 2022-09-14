package mx.com.metalsa.spx.rest.api.config;

import lombok.NonNull;
import mx.com.metalsa.spx.rest.api.service.InfoService;
import mx.com.metalsa.spx.rest.api.service.info.impl.InfoServiceImpl1;
import mx.com.metalsa.spx.rest.api.service.info.impl.InfoServiceImpl2;
import mx.com.metalsa.spx.rest.api.service.info.impl.InfoServiceImpl3;
import mx.com.metalsa.spx.rest.api.service.info.impl.InfoServiceImpl4;
import mx.com.metalsa.spx.soap.web.services.ReportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

@EnableWs
@Configuration
//@PropertySource(value = "classpath:implementation.properties")		// Use his when file is in classpath, ex: main/src/resources
@PropertySource("file:./config/implementation.properties")
public class AppConfig {
	
	@Value("${info.implementation}")
	String impl;

	@Value("${userId}")
	@NonNull
	private String userId;
	@Value("${password}")
	@NonNull
	private String password;
	
	@Bean
	public InfoService getImplementationFromPropertiesFile() {
		System.out.println("Implementation: " + impl);
		
		switch(impl) {
			case "impl1": {
				return new InfoServiceImpl1();
			}
			
			case "impl2": {
				return new InfoServiceImpl2();
			}
			
			case "impl3": {
				return new InfoServiceImpl3();
			}
			
			case "impl4": {
				return new InfoServiceImpl4();
			}
			
			default: {
				throw new IllegalStateException("No such implementation: " + impl);
			}
		}
	}

	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}



	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("mx.com.metalsa.spx.soap.service.reports.wsdl");
		return marshaller;
	}

	@Bean
	public ReportClient reportClient(Jaxb2Marshaller marshaller) {
		ReportClient client = new ReportClient();
		client.setUserId(userId);
		client.setPassword(password);
		client.setDefaultUri("https://hcun-dev3.fa.us2.oraclecloud.com:443/xmlpserver/services/v2/ReportService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
