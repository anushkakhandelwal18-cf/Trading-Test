package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d529351u.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm workArea
* @parm dclfeSpiPlnVar
* @parm sqlca
     * @return 
     */
    public ResultSet openCsplnvD529351u(WorkArea workArea, DclfeSpiPlnVar dclfeSpiPlnVar, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsplnv
* @parm sqlca
     */
    public void fetchCsplnvD529351u(ResultSet csplnvResultSet, HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrToSvc
* @parm sqlca
     * @return 
     */
    public ResultSet openCsfrtoD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsfrto
* @parm sqlca
     */
    public void fetchCsfrtoD529351u(ResultSet csfrtoResultSet, HvHostVariablesCsfrto hvHostVariablesCsfrto, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     * @return 
     */
    public ResultSet openCsptypD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     */
    public void fetchCsptypD529351u(ResultSet csptypResultSet, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm lstIcdKey
* @parm testVariables
* @parm sqlca
* @parm dclfeSpiRuleIcd
     * @return 
     */
    public ResultSet openCsicdD529351u(LstIcdKey lstIcdKey, TestVariables testVariables, Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdD529351u(ResultSet csicdResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     * @return 
     */
    public ResultSet openCsfcndD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     */
    public void fetchCsfcndD529351u(ResultSet csfcndResultSet, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclfeSpiRuleCaus
* @parm sqlca
     */
    public void selectFeSpiRuleCaus(DclfeSpiRuleCaus dclfeSpiRuleCaus, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclfeSpiRuleIpa
* @parm sqlca
     */
    public void selectFeSpiRuleIpa(DclfeSpiRuleIpa dclfeSpiRuleIpa, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrToSvc
* @parm sqlca
     * @return 
     */
    public ResultSet openSvcMainCsrD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesSvcmain
* @parm sqlca
     */
    public void fetchSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, HvHostVariablesSvcmain hvHostVariablesSvcmain, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm dclfeSpiRuleCaus
* @parm testVariables
* @parm dclfeSpiRuleIpa
* @parm dclfeSpiRuleProvTyp
* @parm sqlca
* @parm dclfeSpiRuleCpeFlg
     * @return 
     */
    public ResultSet openCombCurD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, DclfeSpiRuleCaus dclfeSpiRuleCaus, TestVariables testVariables, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCombcr
* @parm sqlca
     */
    public void fetchCombCurD529351u(ResultSet combCurResultSet, HvHostVariablesCombcr hvHostVariablesCombcr, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm lstIcdKey
* @parm testVariables
* @parm sqlca
* @parm dclfeSpiRuleIcd
     * @return 
     */
    public ResultSet openCsicdFirst9999SpiD529351u(LstIcdKey lstIcdKey, TestVariables testVariables, Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca) throws Exception;

}
