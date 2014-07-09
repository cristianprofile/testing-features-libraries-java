package com.mylab.cromero.dto;

import java.util.Arrays;
import java.util.List;




public class BeanOrigen  {

	private String name;

	private String country;
	
	private Integer edad ;
	
	private BeanAnidado beanAnidado ;
	
	private List<BeanAnidado> listaBeanAnidado ;
	
	private BeanAnidado[] vectorBeanAnidado ;

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

	public BeanAnidado getBeanAnidado() {
		return beanAnidado;
	}

	public void setBeanAnidado(BeanAnidado beanAnidado) {
		this.beanAnidado = beanAnidado;
	}

	public List<BeanAnidado> getListaBeanAnidado() {
		return listaBeanAnidado;
	}

	public void setListaBeanAnidado(List<BeanAnidado> listaBeanAnidado) {
		this.listaBeanAnidado = listaBeanAnidado;
	}

	public BeanAnidado[] getVectorBeanAnidado() {
		return vectorBeanAnidado;
	}

	public void setVectorBeanAnidado(BeanAnidado[] vectorBeanAnidado) {
		this.vectorBeanAnidado = vectorBeanAnidado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestBean [name=");
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
