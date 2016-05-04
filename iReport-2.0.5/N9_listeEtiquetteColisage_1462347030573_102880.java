/*
 * Generated by JasperReports - 04/05/16 09:30
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
public class N9_listeEtiquetteColisage_1462347030573_102880 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_SYLOB_CODE_ENTITE = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillField field_idAdresse = null;
    private JRFillField field_dateExpedition = null;
    private JRFillField field_codeLangue = null;
    private JRFillField field_getGestionMultiIndice = null;
    private JRFillField field_idClient = null;
    private JRFillField field_codeUniteGestionPoids = null;
    private JRFillField field_nbDecimaleGestionPoids = null;
    private JRFillField field_codePays = null;
    private JRFillField field_logoSociete = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;
    private JRFillVariable variable_ClientAdresse_COUNT = null;


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
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_SYLOB_CODE_ENTITE = (JRFillParameter)pm.get("SYLOB_CODE_ENTITE");
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
        field_idAdresse = (JRFillField)fm.get("idAdresse");
        field_dateExpedition = (JRFillField)fm.get("dateExpedition");
        field_codeLangue = (JRFillField)fm.get("codeLangue");
        field_getGestionMultiIndice = (JRFillField)fm.get("getGestionMultiIndice");
        field_idClient = (JRFillField)fm.get("idClient");
        field_codeUniteGestionPoids = (JRFillField)fm.get("codeUniteGestionPoids");
        field_nbDecimaleGestionPoids = (JRFillField)fm.get("nbDecimaleGestionPoids");
        field_codePays = (JRFillField)fm.get("codePays");
        field_logoSociete = (JRFillField)fm.get("logoSociete");
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
        variable_ClientAdresse_COUNT = (JRFillVariable)vm.get("ClientAdresse_COUNT");
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
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
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
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_idClient.getValue()) + ((java.lang.String)field_idAdresse.getValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../societe"));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)("dm1/commun/PpageHeaderDocumentInternePaysage.jasper");//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Object)(((java.lang.Integer)field_nbDecimaleGestionPoids.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Object)(((java.lang.Object)field_logoSociete.getValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Object)(new Boolean(((java.lang.Integer)field_getGestionMultiIndice.getValue()).intValue()>0));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(( ((java.lang.String)field_codeLangue.getValue()) != null ? CochiseResourceBundle.getPublicationBundle(new Locale(((java.lang.String)field_codeLangue.getValue()), ((java.lang.String)field_codePays.getValue()))) : ((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue())));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_codeUniteGestionPoids.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.Object)(((java.lang.Long)field_dateExpedition.getValue()));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "."));//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)("dm9/123/N9_etiquetteColisage.jasper");//$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)variable_ClientAdresse_COUNT.getValue()));//$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = (java.lang.String)(((java.lang.Integer)variable_ClientAdresse_COUNT.getValue()) +  "/");//$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../utilisateurActif"));//$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = (java.lang.String)("dm1/commun/PpageFooterDocumentInterne.jasper");//$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = (java.lang.String)(str("page")+" " + ((java.lang.Integer)variable_PAGE_NUMBER.getValue()) + "/");//$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = (java.lang.String)("" + ((java.lang.Integer)variable_PAGE_NUMBER.getValue()) + "");//$JR_EXPR_ID=28$
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
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
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
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_idClient.getOldValue()) + ((java.lang.String)field_idAdresse.getOldValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../societe"));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)("dm1/commun/PpageHeaderDocumentInternePaysage.jasper");//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Object)(((java.lang.Integer)field_nbDecimaleGestionPoids.getOldValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Object)(((java.lang.Object)field_logoSociete.getOldValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Object)(new Boolean(((java.lang.Integer)field_getGestionMultiIndice.getOldValue()).intValue()>0));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(( ((java.lang.String)field_codeLangue.getOldValue()) != null ? CochiseResourceBundle.getPublicationBundle(new Locale(((java.lang.String)field_codeLangue.getOldValue()), ((java.lang.String)field_codePays.getOldValue()))) : ((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue())));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_codeUniteGestionPoids.getOldValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.Object)(((java.lang.Long)field_dateExpedition.getOldValue()));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "."));//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)("dm9/123/N9_etiquetteColisage.jasper");//$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)variable_ClientAdresse_COUNT.getOldValue()));//$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = (java.lang.String)(((java.lang.Integer)variable_ClientAdresse_COUNT.getOldValue()) +  "/");//$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../utilisateurActif"));//$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = (java.lang.String)("dm1/commun/PpageFooterDocumentInterne.jasper");//$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = (java.lang.String)(str("page")+" " + ((java.lang.Integer)variable_PAGE_NUMBER.getOldValue()) + "/");//$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = (java.lang.String)("" + ((java.lang.Integer)variable_PAGE_NUMBER.getOldValue()) + "");//$JR_EXPR_ID=28$
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
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=0$
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
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = (java.lang.Integer)(new Integer(1));//$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = (java.lang.Integer)(new Integer(0));//$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_idClient.getValue()) + ((java.lang.String)field_idAdresse.getValue()));//$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../societe"));//$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = (java.lang.String)("dm1/commun/PpageHeaderDocumentInternePaysage.jasper");//$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = (java.lang.Object)(((java.lang.Integer)field_nbDecimaleGestionPoids.getValue()));//$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = (java.lang.Object)(((java.lang.Object)field_logoSociete.getValue()));//$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = (java.lang.Object)(new Boolean(((java.lang.Integer)field_getGestionMultiIndice.getValue()).intValue()>0));//$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = (java.lang.Object)(( ((java.lang.String)field_codeLangue.getValue()) != null ? CochiseResourceBundle.getPublicationBundle(new Locale(((java.lang.String)field_codeLangue.getValue()), ((java.lang.String)field_codePays.getValue()))) : ((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue())));//$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = (java.lang.Object)(((java.lang.String)field_codeUniteGestionPoids.getValue()));//$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = (java.lang.Object)(((java.lang.Long)field_dateExpedition.getValue()));//$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "."));//$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = (java.lang.String)("dm9/123/N9_etiquetteColisage.jasper");//$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = (java.lang.Integer)(((java.lang.Integer)variable_ClientAdresse_COUNT.getEstimatedValue()));//$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = (java.lang.String)(((java.lang.Integer)variable_ClientAdresse_COUNT.getEstimatedValue()) +  "/");//$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = (java.lang.Object)(((java.util.ResourceBundle)parameter_REPORT_RESOURCE_BUNDLE.getValue()));//$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = (net.sf.jasperreports.engine.JRDataSource)(IReportUtil.subDataSource(((net.sf.jasperreports.engine.JRDataSource)parameter_REPORT_DATA_SOURCE.getValue()), "../utilisateurActif"));//$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = (java.lang.String)("dm1/commun/PpageFooterDocumentInterne.jasper");//$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = (java.lang.String)(str("page")+" " + ((java.lang.Integer)variable_PAGE_NUMBER.getEstimatedValue()) + "/");//$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = (java.lang.String)("" + ((java.lang.Integer)variable_PAGE_NUMBER.getEstimatedValue()) + "");//$JR_EXPR_ID=28$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
