package com.mylab.cromero.dto;

import java.util.Arrays;
import java.util.List;




public class BeanDestino  {

	private String name;

	private String country;
	
	private Integer edad ;
	
	private BeanAnidado2 beanAnidado ;
	
	private List<BeanAnidado2> listaBeanAnidado ;
	
	private BeanAnidado2[] vectorBeanAnidado ;



	public BeanAnidado2[] getVectorBeanAnidado() {
		return vectorBeanAnidado;
	}

	public void setVectorBeanAnidado(BeanAnidado2[] vectorBeanAnidado) {
		this.vectorBeanAnidado = vectorBeanAnidado;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public BeanAnidado2 getBeanAnidado() {
		return beanAnidado;
	}

	public void setBeanAnidado(BeanAnidado2 beanAnidado) {
		this.beanAnidado = beanAnidado;
	}

	public List<BeanAnidado2> getListaBeanAnidado() {
		return listaBeanAnidado;
	}

	public void setListaBeanAnidado(List<BeanAnidado2> listaBeanAnidado) {
		this.listaBeanAnidado = listaBeanAnidado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestBeanDestino [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", beanAnidado=");
		builder.append(beanAnidado);
		builder.append(", listaBeanAnidado=");
		builder.append(listaBeanAnidado);
		builder.append(", vectorBeanAnidado=");
		builder.append(Arrays.toString(vectorBeanAnidado));
		builder.append("]");
		return builder.toString();
	}

	
	

	

	

}
