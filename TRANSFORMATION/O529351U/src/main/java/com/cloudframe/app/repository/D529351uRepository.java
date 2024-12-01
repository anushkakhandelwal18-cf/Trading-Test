package com.cloudframe.app.repository;

import com.cloudframe.app.dto.d529351u.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm workArea
* @parm dclfeSpiPlnVar
     * @return 
     */
    public ResultSet openCsplnvD529351u(Sqlca sqlca, WorkArea workArea, DclfeSpiPlnVar dclfeSpiPlnVar) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsplnv
     */
    public void fetchCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca, HvHostVariablesCsplnv hvHostVariablesCsplnv) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openCsfrtoD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

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
     * @parm dclfeSpiRuleIcd
* @parm testVariables
* @parm sqlca
* @parm lstIcdKey
     * @return 
     */
    public ResultSet openCsicdD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca, LstIcdKey lstIcdKey) throws Exception;

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
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     * @return 
     */
    public ResultSet openCsfcndD529351u(Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     */
    public void fetchCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleCaus
     */
    public void selectFeSpiRuleCaus(Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus) throws Exception;

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
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openSvcMainCsrD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

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
     * @parm testVariables
* @parm dclfeSpiRuleIpa
* @parm dclfeSpiRuleProvTyp
* @parm sqlca
* @parm dclfeSpiRuleCaus
* @parm dclfeSpiRuleFrCondPos
* @parm dclfeSpiRuleCpeFlg
     * @return 
     */
    public ResultSet openCombCurD529351u(TestVariables testVariables, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca, DclfeSpiRuleCaus dclfeSpiRuleCaus, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCombcr
     */
    public void fetchCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca, HvHostVariablesCombcr hvHostVariablesCombcr) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleIcd
* @parm testVariables
* @parm sqlca
* @parm lstIcdKey
     * @return 
     */
    public ResultSet openCsicdFirst9999SpiD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, TestVariables testVariables, Sqlca sqlca, LstIcdKey lstIcdKey) throws Exception;

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
