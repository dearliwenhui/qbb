package com.qbb.common;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  响应单例类  spring Component 
 */
@Component
public class ResponseAPI {
	//实例化jackson mapper 
	public  ObjectMapper mapper = new ObjectMapper();
	public  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * jackson 的 json 序列化
	 */
	public  String getJsonString(Object object){
		String result =null;
		try {
			
			mapper.setDateFormat(sdf);
			result= mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
}

