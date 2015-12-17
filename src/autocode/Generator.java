/*
 * Copyright (c) 2015 金联所. All rights reserved.
 *
 * The copyright to the computer software herein is the property of 金联所.
 * The software may be used and/or copied only with the written permission 
 * of 金联所, or in accordance with the terms and conditions stipulated in 
 * the agreement/contract under which the software has been supplied.
 *
 */
package autocode;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  lenovo 2015年12月17日
 */
public class Generator {
    
    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
        GeneratorFacade g = new GeneratorFacade();
        g.deleteOutRootDir();
        //删除生成器的输出目录//
        /*g.generateByTable("TBL_BANK_CARD","template");
        g.generateByTable("TBL_BORROWER","template");
        g.generateByTable("TBL_BORROWER_BORROW_RECORD","template");
        g.generateByTable("TBL_BORROWER_REFUND_PLAN","template");
        g.generateByTable("TBL_CREDITOR_TRANSFER","template");
        
        g.generateByTable("TBL_ID_CARD","template");
        g.generateByTable("TBL_MEMBER","template");
        g.generateByTable("TBL_MEMBER_ACCOUNT","template");
        g.generateByTable("TBL_MEMBER_ACCOUNT_SNAPSHOT","template");
        g.generateByTable("TBL_MEMBER_FUND_RECORD","template");
        
        g.generateByTable("TBL_MEMBER_INVESTMENT","template");
        g.generateByTable("TBL_MEMBER_LOGIN_INFO","template");
        g.generateByTable("TBL_MEMBER_RECEIPT_PLAN","template");
        g.generateByTable("TBL_MESSAGE","template");
        g.generateByTable("TBL_NOTIFICATION","template");
        
        g.generateByTable("TBL_NOTIFICATION_SETTING","template");
        g.generateByTable("TBL_OPERATION_LOG","template");
        g.generateByTable("TBL_PAYMENT_CHANNEL","template");
        g.generateByTable("TBL_PRODUCT","template");
        g.generateByTable("TBL_PRODUCT_ITEM","template");
        
        g.generateByTable("TBL_PRODUCT_ITEM_SETTING","template");*/
        //g.generateByTable("TBL_PRO_ITEM_BOR_RECORD_REL","template");
        //g.generateByTable("TBL_PRODUCT_ITEM_INVEST_INFO","template");
        //g.generateByTable("TBL_PRODUCT_ITEM_LICAI_INFO","template");
        //通过数据库表生成文件,template为模板的根目录
        //g.generateByAllTable("template");
        //自动搜索数据库中的所有表并生成文件,template为模板的根目录
        //g.generateByClass(Blog.class,"template_clazz");
        //  g.deleteByTable("table_name", "template");
        //删除生成的文件
        
        /*g.generateByTable("TBL_COUPON","template");
        g.generateByTable("TBL_COUPON_RULE","template");
        g.generateByTable("TBL_MEMBER_COUPON","template");
        g.generateByTable("TBL_MEMBER_INVESTMENT","template");
        g.generateByTable("TBL_MEMBER_RECEIPT_PLAN","template");*/
        
        g.generateByTable("TBL_MEMBER","template");
    }

}
