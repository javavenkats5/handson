package com.sv.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import com.sv.data.Customer;
import com.sv.mngr.CustomerServiceMngr;

@Path("/customer")
public class CustomerService {

	@Context
	protected ServletContext servletContext;
	@Autowired
	CustomerServiceMngr bean;
/**
 * http://localhost:8082/spring-rest-basicauth/rest/customer/getCustomers
 * @return
 */
	@GET
	@Path("/getCustomers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {

		List<Customer> customrs = new ArrayList<Customer>();

		Customer cust1 = new Customer(1, "Venkat", "Dallas,TX");
		Customer cust2 = new Customer(2, "Sri", "Dallas,TX");
		customrs.add(cust1);
		customrs.add(cust2);
System.out.println("getCustomers:");
		return customrs;
	}
/**
 * http://localhost:8082/spring-rest-hibernate/rest/customer/getCustomer/1
 * @param custId
 * @return
 */
	@GET
	@Path("/getCustomer/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("custId") int custId) {

		Customer cust1 = new Customer(1, "Venkat", "Dallas,TX");
		/*
		 * CustomerServiceMngr bean =
		 * WebApplicationContextUtils.getWebApplicationContext(servletContext)
		 * .getBean(CustomerServiceMngr.class);
		 */
		//System.out.println("msg:" + bean.getMeg());
		return cust1;
	}

	@POST
	@Path("/saveCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer saveCustomer(Customer cutomer) {

		cutomer.setName(cutomer.getName() + "-Changed");
		System.out.println("cutomer:" + cutomer);
		return cutomer;
	}
	
	@GET
	@Path("/selectCustomer")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer selectCustomer(@RequestParam String id) {

		System.out.println("cutomer id:" + id);
		Customer cutomer=new Customer();
		return cutomer;
	}
}
