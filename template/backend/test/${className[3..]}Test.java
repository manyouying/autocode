<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first> 
package ${backendpackage}.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ${servicepackage}.${className}Service;
import ${servicepackage}.pojo.${className};

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/applicationContext.xml",
		"classpath:/spring/servlet-context.xml" })
public class ${className}Test {

	@Resource
	private ${className}Service ${classNameLower}Service;
        String id="1";

        @Before
	@Test
	public void testInsert${className}() {
	    ${className} ${classNameLower} = new ${className}();
	    <#list table.columns as column>  
	    <#if column.isDateTimeColumn>  
	    ${classNameLower}.set${column.columnName}(new Date());
	    <#elseif column.isNumberColumn>
            ${classNameLower}.set${column.columnName}(1L); 
	    <#else>
	    ${classNameLower}.set${column.columnName}("1"); 
	    </#if> 
	    </#list> 
	    boolean flag = ${classNameLower}Service.insert${className}(${classNameLower});
	    Assert.assertTrue(flag);
	    id = ${classNameLower}.getId();
	    System.out.println(flag);
	}

	@Test
	public void testUpdate${className}() {
	    ${className} ${classNameLower} = new ${className}();
	    <#list table.columns as column>  
            <#if column.isDateTimeColumn>  
            ${classNameLower}.set${column.columnName}(new Date());
            <#elseif column.isNumberColumn>
            ${classNameLower}.set${column.columnName}(1L); 
            <#else>
            ${classNameLower}.set${column.columnName}("1"); 
            </#if> 
            </#list>
            ${classNameLower}.setId(id);
	    boolean flag = ${classNameLower}Service.update${className}(${classNameLower});
	    Assert.assertTrue(flag);
	    System.out.println(flag);
	}
	
	@Test
        public void testGet${className}() {
            ${className} ${classNameLower} = ${classNameLower}Service.get${className}(id);
            Assert.assertNotNull(${classNameLower});
        }
	
	@Test
        public void testDelete${className}() {
            boolean flag = ${classNameLower}Service.delete${className}(id);
            Assert.assertTrue(flag);
            System.out.println(flag);
        }

	//@Test
	//public void testGet${className}s() {
	//	List<${className}> ${classNameLower}s = null;
	//	${classNameLower}s = ${classNameLower}Service.get${className}s();
	//}
}