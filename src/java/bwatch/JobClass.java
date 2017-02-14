/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

/**
 *
 * @author hansa
 */
public class JobClass {
    
    String jobPosition              =   null;
    private String jobtitle         =   null;
    private String jobDescription   =   null;
    private String jobCountry       =   null;
    private String jobCategory      =   null;
    private String jobSalary        =   null;
    private String jobFeatures      =   null;
    private String jobStatus        =   null;
    private String jobFlag          =   null;
    private int    jobId;
    
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
    
    
    public String createJSONObject(){
        String jsonString = 
                    "jobPosition"+":"+this.jobPosition+","+"jobtitle"+":"+ this.jobtitle+","+
                    "jobDescription"+":"+this.jobDescription+","+"jobCountry"+":"+this.jobCountry+","+
                    "jobCategory"+":"+this.jobCategory+","+"jobSalary"+":"+this.jobSalary+","+
                    "jobFeatures"+":"+this.jobFeatures+","+"jobStatus"+":"+this.jobStatus+","+
                    "jobFlag"+":"+this.jobFlag;
        return jsonString;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobCountry() {
        return jobCountry;
    }

    public void setJobCountry(String jobCountry) {
        this.jobCountry = jobCountry;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(String jobSalary) {
        this.jobSalary = jobSalary;
    }

    public String getJobFeatures() {
        return jobFeatures;
    }

    public void setJobFeatures(String jobFeatures) {
        this.jobFeatures = jobFeatures;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobFlag() {
        return jobFlag;
    }

    public void setJobFlag(String jobFlag) {
        this.jobFlag = jobFlag;
    }
    
    public String jobString(){
        return ("'"+this.jobPosition+"','"+this.jobtitle+"','"+this.jobCategory+"','"+this.jobCountry+"','"+
                this.jobDescription+"','"+this.jobSalary+"','"+this.jobFeatures+"'");
    }  
       
}
