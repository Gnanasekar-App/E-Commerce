package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Address;

@Service
public interface AddressService {
	
	public Address addAddress(Address add);
	public Address updateAddress(Address add);
	public Address removeAddress(Integer id);
	public Address viewAddress(Integer addressId);
	public List<Address> viewAllAddress();
	

}

