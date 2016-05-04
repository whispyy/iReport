/*
 * Generated by JasperReports - 22/04/16 13:56
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;

import com.sylob.cochise.composant.util.*;
import net.sf.jasperreports.engine.*;
import java.util.*;
import com.sylob.cochise.composant.printmanager.datasource.*;
import net.sf.jasperreports.engine.data.*;


/**
 *
 */
public class listeetiquetteProduction_1461326184765_444310 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_PATH = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillField field_idArticle = null;
    private JRFillField field_idClient = null;
    private JRFillField field_article47code = null;
    private JRFillField field_article47designation = null;
    private JRFillField field_indiceArticle = null;
    private JRFillField field_codeOF = null;
    private JRFillField field_sigle = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;
    private JRFillVariable variable_Groupe1_COUNT = null;
    private JRFillVariable variable_LIGNE_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_PATH = (JRFillParameter)pm.get("PATH");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_REPORT_FILE_RESOLVER = (JRFillParameter)pm.get("REPORT_FILE_RESOLVER");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_idArticle = (JRFillField)fm.get("idArticle");
        field_idClient = (JRFillField)fm.get("idClient");
        field_article47code = (JRFillField)fm.get("article/code");
        field_article47designation = (JRFillField)fm.get("article/designation");
        field_indiceArticle = (JRFillField)fm.get("indiceArticle");
        field_codeOF = (JRFillField)fm.get("codeOF");
        field_sigle = (JRFillField)fm.get("sigle");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
        variable_Groupe1_COUNT = (JRFillVariable)vm.get("Groupe1_COUNT");
        variable_LIGNE_COUNT = (JRFillVariable)vm.get("LIGNE_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.String)("D:/ProgramFiles/workspace/CochiseRessources/WebRoot/etat/jasper");//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(new Integer(1));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Object)(null);//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)("N� OF");//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.String)((IReportUtil.isNotEmpty(((java.lang.String)field_article47code.getValue()))?((java.lang.String)field_article47code.getValue()):"")+//$JR_EXPR_ID=15$
//$JR_EXPR_ID=15$
(IReportUtil.isNotEmpty(((java.lang.String)field_indiceArticle.getValue()))?(" / "+((java.lang.String)field_indiceArticle.getValue())):""));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)((IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "R/S")?("/home/partage/images/sigle/RS"+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "N")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "R")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "S")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):""));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.String)("ARTICLE");//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.requeteDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()),"select condition from ConditionClientEntite condition where condition.article.id='"+((java.lang.String)field_idArticle.getValue())+"' and condition.client.id='"+((java.lang.String)field_idClient.getValue())+"'"));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (java.lang.String)("dm1/commun/N9_referenceTiers.jasper");//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)(((java.lang.String)field_codeOF.getValue()));//$JR_EXPR_ID=21$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.String)("D:/ProgramFiles/workspace/CochiseRessources/WebRoot/etat/jasper");//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(new Integer(1));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Object)(null);//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)("N� OF");//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.String)((IReportUtil.isNotEmpty(((java.lang.String)field_article47code.getOldValue()))?((java.lang.String)field_article47code.getOldValue()):"")+//$JR_EXPR_ID=15$
//$JR_EXPR_ID=15$
(IReportUtil.isNotEmpty(((java.lang.String)field_indiceArticle.getOldValue()))?(" / "+((java.lang.String)field_indiceArticle.getOldValue())):""));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)((IReportUtil.equals(((java.lang.String)field_sigle.getOldValue()), "R/S")?("/home/partage/images/sigle/RS"+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getOldValue()), "N")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getOldValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getOldValue()), "R")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getOldValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getOldValue()), "S")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getOldValue())+".jpg"):""));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.String)("ARTICLE");//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.requeteDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()),"select condition from ConditionClientEntite condition where condition.article.id='"+((java.lang.String)field_idArticle.getOldValue())+"' and condition.client.id='"+((java.lang.String)field_idClient.getOldValue())+"'"));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (java.lang.String)("dm1/commun/N9_referenceTiers.jasper");//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)(((java.lang.String)field_codeOF.getOldValue()));//$JR_EXPR_ID=21$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = (java.lang.String)("D:/ProgramFiles/workspace/CochiseRessources/WebRoot/etat/jasper");//$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(new Integer(1));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.Object)(null);//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.String)("N� OF");//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.String)((IReportUtil.isNotEmpty(((java.lang.String)field_article47code.getValue()))?((java.lang.String)field_article47code.getValue()):"")+//$JR_EXPR_ID=15$
//$JR_EXPR_ID=15$
(IReportUtil.isNotEmpty(((java.lang.String)field_indiceArticle.getValue()))?(" / "+((java.lang.String)field_indiceArticle.getValue())):""));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.String)((IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "R/S")?("/home/partage/images/sigle/RS"+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "N")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "R")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):"")//$JR_EXPR_ID=16$
	+//$JR_EXPR_ID=16$
	(IReportUtil.equals(((java.lang.String)field_sigle.getValue()), "S")?("/home/partage/images/sigle/"+((java.lang.String)field_sigle.getValue())+".jpg"):""));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.String)("ARTICLE");//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.requeteDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()),"select condition from ConditionClientEntite condition where condition.article.id='"+((java.lang.String)field_idArticle.getValue())+"' and condition.client.id='"+((java.lang.String)field_idClient.getValue())+"'"));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (java.lang.String)("dm1/commun/N9_referenceTiers.jasper");//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)(((java.lang.String)field_codeOF.getValue()));//$JR_EXPR_ID=21$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
