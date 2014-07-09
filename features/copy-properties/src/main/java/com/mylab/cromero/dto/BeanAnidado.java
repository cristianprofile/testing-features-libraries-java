package com.mylab.cromero.dto;;




public class BeanAnidado  {

	private String name;

	private String country;
	
	private Integer edad ;
	
	private String otroValor;

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

	public String getOtroValor() {
		return otroValor;
	}

	public void setOtroValor(String otroValor) {
		this.otroValor = otroValor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestBeanAnidado [name=");
		builder.append(name);
		builder.append(", country=");
		builder.append(country);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", otroValor=");
		builder.append(otroValor);
		builder.append("]");
		return builder.toString();
	}

	

	

	

}
