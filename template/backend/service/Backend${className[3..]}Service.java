<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first> 
package ${backendpackage}.service;

import ${backendpackage}.dao.${className}Dao;

import ${servicepackage}.${className}Service;
import ${servicepackage}.pojo.*;
import ${servicepackage}.pojo.condition.${className}Condition;
import com.ippjr.utils.model.PageVo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

@Service
public class Backend${className}Service implements ${className}Service {
        @Resource
        private ${className}Dao ${classNameLower}Dao;

        public ${className} get${className}(String ${classNameLower}Id) {
                return ${classNameLower}Dao.get${className}ById(${classNameLower}Id);
        }
        
        public boolean update${className}(${className} ${classNameLower}) {
            if (${classNameLower}Dao.update${className}(${classNameLower}) > 0) {
                return true;
            }
            return false;
        }
        
        public boolean insert${className}(${className} ${classNameLower}) {
            if (${classNameLower}Dao.insert${className}(${classNameLower}) > 0) {
                return true;
            }
            return false;
        }
        
        public boolean delete${className}(String ${classNameLower}Id) {
            if (${classNameLower}Dao.delete${className}(${classNameLower}Id) > 0) {
                    return true;
            }
            return false;
        }

        public PageVo<${className}> get${className}s(int page, int rows, String asc,
                        String desc) {
            ${className}Condition condition = new ${className}Condition(page, rows, asc,
                                desc);
                List<${className}> ${classNameLower}s = ${classNameLower}Dao.get${className}s(condition);
                int count = ${classNameLower}Dao.getCount(condition);
                PageVo<${className}> vo = new PageVo<${className}>();
                vo.setTotalSize(count);
                vo.setData(${classNameLower}s);
                vo.setPageSize(rows);
                vo.setCurrentPage(page);
                return vo;
        }

}