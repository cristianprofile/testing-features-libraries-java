package com.mylab.cromero.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mylab.cromero.dto.BeanAnidado;
import com.mylab.cromero.dto.BeanDestino;
import com.mylab.cromero.dto.BeanOrigen;
import com.mylab.cromero.mapper.MapperBeanUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/applicationContext.xml")
public class CopyPropertiesSpringBeanTest {

	@Autowired
	private MapperBeanUtil mapperBeanUtil;

	// could not copy diferent dto thowrs exception because is accessed by
	// reflection
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

		tb.setVectorBeanAnidado(new BeanAnidado[] { testBeanAnidado2,
				testBeanAnidado3 });

		BeanDestino tb2 = mapperBeanUtil.springMapper(tb);

		assertTrue("nombre copiado", tb2.getName().equals(tb.getName()));
		assertTrue("country copiado", tb2.getCountry().equals(tb.getCountry()));
		assertTrue("edad copiada", tb2.getEdad() == tb.getEdad());
		assertTrue("subnivel country", tb2.getBeanAnidado() == null);

	}

	// spring copyproperties only copy objects with same type but dozer is
	// allowed to copy beans with diferent types but same values
	@Test
	public void testCopyPropertiesWithIgnore() throws Exception {
		BeanOrigen tb = new BeanOrigen();
		assertTrue("nombre vacio", tb.getName() == null);
		tb.setEdad(32);
		tb.setCountry("madrid");
		tb.setName("cristian");
		BeanOrigen tb2 = new BeanOrigen();
		tb2.setName("rod");
		BeanUtils.copyProperties(tb, tb2, new String[] { "name" });
		assertTrue("nombre copiado", tb2.getName().equalsIgnoreCase("rod"));
		assertTrue("edad copiada", tb2.getEdad() == 32);
		assertTrue("country copiada",
				tb2.getCountry().equalsIgnoreCase("madrid"));
	}

}
