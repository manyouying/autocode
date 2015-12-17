<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first> 
package ${backendpackage}.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ${servicepackage}.pojo.${className};
import ${servicepackage}.pojo.condition.${className}Condition;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

@Repository
public interface ${className}Dao {
        public int insert${className}(${className} ${classNameLower});

        public int delete${className}(String id);

        public int update${className}(${className} ${classNameLower});

        public ${className} get${className}ById(String id);

        public List<${className}> get${className}s(${className}Condition condition);
        
        public int getCount(${className}Condition condition);
}