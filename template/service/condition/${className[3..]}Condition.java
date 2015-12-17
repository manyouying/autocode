<#include "/java_copyright.include">  
<#assign className = table.className?substring(3)>     
<#assign classNameLower = className?uncap_first> 
package ${servicepackage}.pojo.condition;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  autocode 2015年1月28日
 */

public class ${className}Condition {
        private int page;
        private int rows;
        private String asc;
        private String desc;

        public ${className}Condition(int page, int rows, String asc, String desc) {
                this.page = page;
                this.rows = rows;
                this.asc = asc;
                this.desc = desc;
        }

        public int getPage() {
                return page;
        }

        public void setPage(int page) {
                this.page = page;
        }

        public int getRows() {
                return rows;
        }

        public void setRows(int rows) {
                this.rows = rows;
        }

        public String getAsc() {
                return asc;
        }

        public void setAsc(String asc) {
                this.asc = asc;
        }

        public String getDesc() {
                return desc;
        }

        public void setDesc(String desc) {
                this.desc = desc;
        }
}