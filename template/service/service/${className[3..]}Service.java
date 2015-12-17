<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first>  
package ${servicepackage};

import java.util.List;

import ${servicepackage}.pojo.*;
import com.ippjr.utils.model.PageVo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

public interface ${className}Service {

        public boolean insert${className}(${className} ${classNameLower});

        public boolean delete${className}(String ${classNameLower}Id);
        
        public boolean update${className}(${className} ${classNameLower});

        public ${className} get${className}(String ${classNameLower}Id);

        public PageVo<${className}> get${className}s(int page, int rows, String asc, String desc);

}