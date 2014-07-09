package com.mylab.cromero.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import com.mylab.cromero.dto.BeanAnidado;
import com.mylab.cromero.dto.BeanAnidado2;
import com.mylab.cromero.dto.BeanDestino;
import com.mylab.cromero.dto.BeanOrigen;
import com.mylab.cromero.mapper.MapperBeanUtil;

public class CopyPropertiesDozerTest {

   
    
    @Test
    public void testCopyPropertiesDozzerSimple() throws Exception {
		BeanOrigen tb = new BeanOrigen();
		tb.setName("rod");
		tb.setCountry("madrid");
		tb.setEdad(22);
		BeanAnidado testBeanAnidado = new BeanAnidado();
		testBeanAnidado.setName("maria");
		testBeanAnidado.setCountry("barcelona");
		testBeanAnidado.setEdad(11);
		testBeanAnidado.setOtroValor("manolitooo");
		tb.setBeanAnidado(testBeanAnidado);
		
		BeanAnidado testBeanAnidado2 = new BeanAnidado();
		testBeanAnidado2.setName("pepe");
		testBeanAnidado2.setCountry("papplona");
		testBeanAnidado2.setEdad(22);
		testBeanAnidado2.setOtroValor("otro valor 1");

		BeanAnidado testBeanAnidado3 = new BeanAnidado();
		testBeanAnidado3.setName("juan");
		testBeanAnidado3.setCountry("sevilla");
		testBeanAnidado3.setEdad(33);
		testBeanAnidado3.setOtroValor("otro valor 2");
		
		tb.setListaBeanAnidado(new ArrayList<BeanAnidado>());
		tb.getListaBeanAnidado().add(testBeanAnidado2);
		tb.getListaBeanAnidado().add(testBeanAnidado3);
		
		tb.setVectorBeanAnidado(new BeanAnidado[]{testBeanAnidado2,testBeanAnidado3});
		
		BeanDestino tb2 = MapperBeanUtil.dozzerMapper(tb);
		assertTrue("nombre copiado", tb2.getName().equals(tb.getName()));
		assertTrue("country copiado", tb2.getCountry().equals(tb.getCountry()));
		assertTrue("edad copiada", tb2.getEdad() == tb.getEdad());
		assertTrue("subnivel nombre", tb2.getBeanAnidado().getName().equals(tb.getBeanAnidado().getName()));
		assertTrue("subnivel country", tb2.getBeanAnidado().getCountry().equals(tb.getBeanAnidado().getCountry()));
		assertTrue("edad copiada", tb2.getBeanAnidado().getEdad() == tb.getBeanAnidado().getEdad());
		assertTrue("subnivel otro valor", tb2.getBeanAnidado().getOtroValor().equals(tb.getBeanAnidado().getOtroValor()));
		assertTrue("subnivel lista", tb2.getListaBeanAnidado().size()==tb.getListaBeanAnidado().size());
	    
		//muestro la lista por pantalla para ver que las listas las copia correctamente
		for (BeanAnidado2 testbean : tb2.getListaBeanAnidado()) {
			System.out.println("lista"+testbean);
		
		}
		
		assertTrue("subnivel lista", tb2.getVectorBeanAnidado().length==tb2.getVectorBeanAnidado().length);
		
		System.out.println("vector:"+tb2.getVectorBeanAnidado().length);
		for (int i = 0; i < tb2.getVectorBeanAnidado().length; i++) {
		      System.out.println("vector::"+tb2.getVectorBeanAnidado()[i]); //se muestra cada elemento del array
		}
		
		
    }


   
   
    
   

   

  

}
