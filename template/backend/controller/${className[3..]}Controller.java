<#include "/java_copyright.include">
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first>
package ${backendpackage}.controller;

import java.util.List;

import javax.annotation.Resource;

import ${servicepackage}.pojo.*;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ${servicepackage}.${className}Service;

import com.ippjr.utils.model.PageVo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

@RestController
@RequestMapping("/${classNameLower}")
public class ${className}Controller {
        @Resource
        private ${className}Service ${classNameLower}Service;
        
        @RequestMapping(value = "/${classNameLower}Id/{${classNameLower}Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public ${className} get${classNameLower}ById(
                        @PathVariable String ${classNameLower}Id) {
                return ${classNameLower}Service.get${className}(${classNameLower}Id);
        }

        @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
        public boolean insert(@RequestBody ${className} ${classNameLower}) {
                return ${classNameLower}Service.insert${className}(${classNameLower});
        }

        @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
        public boolean update(@RequestBody ${className} ${classNameLower}) {
                return ${classNameLower}Service.update${className}(${classNameLower});
        }

        @RequestMapping(value = "/{${classNameLower}Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
        public boolean delete(@PathVariable String ${classNameLower}Id) {
                return ${classNameLower}Service.delete${className}(${classNameLower}Id);
        }

        @RequestMapping(value = "/get${className}s", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
        public PageVo<${className}> get${className}s(
                        @RequestParam(value = "page", required = true) int page,
                        @RequestParam(value = "rows", required = true) int rows,
                        @RequestParam(value = "asc", required = false) String asc,
                        @RequestParam(value = "desc", required = false) String desc) {
                return ${classNameLower}Service.get${className}s(page, rows, asc, desc);
        }
}