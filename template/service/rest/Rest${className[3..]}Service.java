<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first>  
package ${servicepackage}.rest;

import java.util.List;

import ${servicepackage}.pojo.*;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;

import com.ippjr.common.service.IPPJRAbastractRestService;
import ${servicepackage}.${className}Service;
import com.ippjr.utils.model.PageVo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

public class Rest${className}Service extends IPPJRAbastractRestService implements
        ${className}Service {
        @Override
        public boolean insert${className}(${className} ${classNameLower}) {
                String url = this.getBaseUrl() + "/${classNameLower}";
                return restTemplate.postForObject(url, ${classNameLower}, boolean.class);
        }

	@Override
	public boolean delete${className}(String ${classNameLower}Id) {
		String url = this.getBaseUrl() + "/${classNameLower}/" + ${classNameLower}Id;
		restTemplate.delete(url);
		return true;
	}

	@Override
	public boolean update${className}(${className} ${classNameLower}) {
		String url = this.getBaseUrl() + "/${classNameLower}";
		restTemplate.put(url, ${classNameLower});
		return true;
	}

	@Override
	public ${className} get${className}(String ${classNameLower}Id) {
		String url = this.getBaseUrl() + "/${classNameLower}/${classNameLower}Id/" + ${classNameLower}Id;
		return restTemplate.getForObject(url, ${className}.class);
	}

	@Override
	public PageVo<${className}> get${className}s(int page, int rows, String asc,
			String desc) {
		String url = this.getBaseUrl() + "/${classNameLower}/get${className}s?page=" + page + "&rows="
				+ rows;
		url += StringUtils.isEmpty(asc) ? "" : "&asc=" + asc;
		url += StringUtils.isEmpty(desc) ? "" : "&desc=" + desc;

		ResponseEntity<PageVo<${className}>> response = restTemplate.exchange(url,
				HttpMethod.GET, null,
				new ParameterizedTypeReference<PageVo<${className}>>() {
				});
		PageVo<${className}> resutl = response.getBody();
		return resutl;
	}

}