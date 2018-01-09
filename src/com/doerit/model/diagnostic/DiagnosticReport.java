package com.doerit.model.diagnostic;

import java.util.Date;

public class DiagnosticReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.PATIENT_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String patientId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.PAST_DENTAL_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String pastDentalHistoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.MEDICAL_RECORD_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String medicalRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.PLAQUE_CONTROL_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String plaqueControlId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.DIETARY_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String dietaryHistoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.DATA_ADDED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String dataAddedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String approvedBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.STATUS
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private Integer sortOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String insertUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private Date insertDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private String updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_diagnostic_report.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.ID
     *
     * @return the value of tbl_patient_diagnostic_report.ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.ID
     *
     * @param id the value for tbl_patient_diagnostic_report.ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.PATIENT_ID
     *
     * @return the value of tbl_patient_diagnostic_report.PATIENT_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.PATIENT_ID
     *
     * @param patientId the value for tbl_patient_diagnostic_report.PATIENT_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.PAST_DENTAL_HISTORY_ID
     *
     * @return the value of tbl_patient_diagnostic_report.PAST_DENTAL_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getPastDentalHistoryId() {
        return pastDentalHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.PAST_DENTAL_HISTORY_ID
     *
     * @param pastDentalHistoryId the value for tbl_patient_diagnostic_report.PAST_DENTAL_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setPastDentalHistoryId(String pastDentalHistoryId) {
        this.pastDentalHistoryId = pastDentalHistoryId == null ? null : pastDentalHistoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.MEDICAL_RECORD_ID
     *
     * @return the value of tbl_patient_diagnostic_report.MEDICAL_RECORD_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getMedicalRecordId() {
        return medicalRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.MEDICAL_RECORD_ID
     *
     * @param medicalRecordId the value for tbl_patient_diagnostic_report.MEDICAL_RECORD_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setMedicalRecordId(String medicalRecordId) {
        this.medicalRecordId = medicalRecordId == null ? null : medicalRecordId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.PLAQUE_CONTROL_ID
     *
     * @return the value of tbl_patient_diagnostic_report.PLAQUE_CONTROL_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getPlaqueControlId() {
        return plaqueControlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.PLAQUE_CONTROL_ID
     *
     * @param plaqueControlId the value for tbl_patient_diagnostic_report.PLAQUE_CONTROL_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setPlaqueControlId(String plaqueControlId) {
        this.plaqueControlId = plaqueControlId == null ? null : plaqueControlId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.DIETARY_HISTORY_ID
     *
     * @return the value of tbl_patient_diagnostic_report.DIETARY_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getDietaryHistoryId() {
        return dietaryHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.DIETARY_HISTORY_ID
     *
     * @param dietaryHistoryId the value for tbl_patient_diagnostic_report.DIETARY_HISTORY_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setDietaryHistoryId(String dietaryHistoryId) {
        this.dietaryHistoryId = dietaryHistoryId == null ? null : dietaryHistoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.DATA_ADDED_BY
     *
     * @return the value of tbl_patient_diagnostic_report.DATA_ADDED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getDataAddedBy() {
        return dataAddedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.DATA_ADDED_BY
     *
     * @param dataAddedBy the value for tbl_patient_diagnostic_report.DATA_ADDED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setDataAddedBy(String dataAddedBy) {
        this.dataAddedBy = dataAddedBy == null ? null : dataAddedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.APPROVED_BY
     *
     * @return the value of tbl_patient_diagnostic_report.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getApprovedBy() {
        return approvedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.APPROVED_BY
     *
     * @param approvedBy the value for tbl_patient_diagnostic_report.APPROVED_BY
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy == null ? null : approvedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.COMMENT
     *
     * @return the value of tbl_patient_diagnostic_report.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.COMMENT
     *
     * @param comment the value for tbl_patient_diagnostic_report.COMMENT
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.STATUS
     *
     * @return the value of tbl_patient_diagnostic_report.STATUS
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.STATUS
     *
     * @param status the value for tbl_patient_diagnostic_report.STATUS
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.SORT_ORDER
     *
     * @return the value of tbl_patient_diagnostic_report.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.SORT_ORDER
     *
     * @param sortOrder the value for tbl_patient_diagnostic_report.SORT_ORDER
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.INSERT_USER_ID
     *
     * @return the value of tbl_patient_diagnostic_report.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_patient_diagnostic_report.INSERT_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.INSERT_DATETIME
     *
     * @return the value of tbl_patient_diagnostic_report.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_patient_diagnostic_report.INSERT_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.UPDATE_USER_ID
     *
     * @return the value of tbl_patient_diagnostic_report.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_patient_diagnostic_report.UPDATE_USER_ID
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_report.UPDATE_DATETIME
     *
     * @return the value of tbl_patient_diagnostic_report.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_report.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_patient_diagnostic_report.UPDATE_DATETIME
     *
     * @mbg.generated Tue Dec 19 03:32:57 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}