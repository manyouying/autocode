<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first> 
package ${apppackage}.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import ${servicepackage}.${className}Service;
import ${servicepackage}.exception.${className}Exception;
import ${servicepackage}.pojo.${className};

import com.ippjr.common.service.IPPJRServiceContext;
import com.ippjr.utils.model.JsonVo;
import com.ippjr.utils.model.PageVo;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

@RestController
public class ${className}Controller extends BaseController {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger
            .getLogger(${className}Controller.class);

    @Autowired
    private IPPJRServiceContext restServiceContext;

    @RequestMapping(value = "get${className}ById", method = RequestMethod.GET)
    public JsonVo<${className}> get${className}(String id) {
        JsonVo<${className}> json = new JsonVo<${className}>();
        boolean _result = false;
        if (StringUtils.hasLength(id)) {
            ${className}Service ${classNameLower}Service = restServiceContext.getService(${className}Service.class);
            ${className} ${classNameLower} = ${classNameLower}Service.get${className}(id);
            json.setData(${classNameLower});
            json.setMsg("load ${classNameLower} by id successfull");
            _result = true;
        }else{
            json.setMsg("Param id expected not be null or length not be 0.");
        }
        json.setResult(_result);
        return json;
    }
    
    
    @RequestMapping(value = "del${className}" , method = RequestMethod.DELETE)
    public JsonVo<String> del${className}(String id) {
        JsonVo<String> json = new JsonVo<String>();
        boolean _result = false;
        if (StringUtils.hasLength(id)) {
            ${className}Service ${classNameLower}Service = restServiceContext.getService(${className}Service.class);
            /**
             * TODO: 做删除前的校验。。。。是否能删除该
             */
            if (${classNameLower}Service.delete${className}(id)) {
                _result = true;
            } else {
                //删除失败。。
                /**
                 * TODO: RestService中应该抛出相应异常，再次捕获
                 */
                json.setMsg("删除${className}失败: Rest API error.");
            }
        } else {
            json.setMsg("Param id expected not be null or length not be 0.");
        }
        json.setResult(_result);
        return json;
    }

    @RequestMapping(value = "add${className}" , method = RequestMethod.POST)
    public JsonVo<String> add${className}(@RequestBody(required = false) ${className} ${classNameLower}) {
        JsonVo<String> json = new JsonVo<String>();
        boolean _result = false;
        ${className}Service ${classNameLower}Service = restServiceContext.getService(${className}Service.class);
        if (${classNameLower}Service.insert${className}(${classNameLower})) {
            _result = true;
        } else {
            json.setMsg("add fail . REST API error!..");
        }
        json.setResult(_result);
        return json;
    }
    
    @RequestMapping(value = "update${className}" , method = RequestMethod.PUT)
    public JsonVo<String> update${className}(@RequestBody(required = false) ${className} ${classNameLower}) {
        JsonVo<String> json = new JsonVo<String>();
        boolean _result = false;
        json.setResult(_result);
        /**
         * TODO: 校验
         */
        if (!StringUtils.hasLength(${classNameLower}.getId())) {
            json.setMsg("Param error . [id] excepted has length...");
            return json;
        }
        ${className}Service ${classNameLower}Service = restServiceContext.getService(${className}Service.class);
        if (${classNameLower}Service.update${className}(${classNameLower})) {
            _result = true;
        } else {
            json.setMsg("update fail . REST API error!..");
        }
        json.setResult(_result);
        return json;
    }

    @RequestMapping(value = "get${className}s", method = RequestMethod.POST)
    public PageVo<${className}> get${className}s(PageVo<${className}> pageVo , 
            HttpSession session , @RequestBody(required=false) Map<String, Object> args) {
        PageVo<${className}> pages = null;
        try {
            ${className}Service ${classNameLower}Service = restServiceContext.getService(${className}Service.class);
            pages = ${classNameLower}Service.get${className}s(pageVo.getCurrentPage() , pageVo.getPageSize() , null, null);
            Map<String , Object> search = new HashMap<String , Object>();
            search.put("use", "admin");
            search.put("opt", "operateLog");
            pages.setSearch(search);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("load ${classNameLower} fail. " + e.getMessage());
        }
        return pages;
    }
}