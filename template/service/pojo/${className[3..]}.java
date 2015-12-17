<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first>   
package ${servicepackage}.pojo;  

import java.io.Serializable;
import java.util.Date; 

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

public class ${className} implements Serializable {  
    private static final long serialVersionUID = 5454155825314635342L;  
      
    <#list table.columns as column>  
    /**  
     * ${column.columnNameLower}  
     */ 
    private ${column.simpleJavaType} ${column.columnNameLower};  
    </#list>  
 
<@generateJavaColumns/>  
 
<#macro generateJavaColumns>  
    <#list table.columns as column>  
        <#if column.isDateTimeColumn>  

        </#if>      
    public void set${column.columnName}(${column.simpleJavaType} ${column.columnNameLower}) {  
        this.${column.columnNameLower} = ${column.columnNameLower};  
    }  
      
    public ${column.simpleJavaType} get${column.columnName}() {  
        return this.${column.columnNameLower};  
    }  
    </#list>  
</#macro>
}