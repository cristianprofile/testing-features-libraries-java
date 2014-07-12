package com.mylab.cromero.mapper;



import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

import com.mylab.cromero.dto.BeanDestino;
import com.mylab.cromero.dto.BeanOrigen;

@Component
public  class MapperBeanUtil {
	
	
	public BeanDestino dozzerMapper(BeanOrigen beanOrigen)
	{
		
		Mapper mapper = new DozerBeanMapper();
		BeanDestino beanDestino =  mapper.map(beanOrigen, BeanDestino.class);
		return beanDestino;
	}
	
	public  BeanDestino springMapper(BeanOrigen beanOrigen) throws BeansException 
	{
		
		BeanDestino beanDestino = new BeanDestino();
		BeanUtils.copyProperties(beanOrigen, beanDestino);
		return beanDestino;
	}
	
	

}
