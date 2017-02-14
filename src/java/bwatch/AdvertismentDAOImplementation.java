/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hansa
 */
public class AdvertismentDAOImplementation implements AddvertismentDAO{
    
    private DbUtil dbUtil;
    
    AdvertismentDAOImplementation(){
        dbUtil = new DbUtil();
    }

    @Override
    public void addJob(JobClass adversimnt) {
        String advertStr = adversimnt.jobString()+",A,0";
        String insetJobSql = "insert into jobs(jobposition,jobtitle,jobCategory,"
                + "jobCountry,jobDescription,jobSalary,jobFeatures,"
                + "jobStatus,jobFlag) values("+advertStr+") ";
        DbUtil.insertion(insetJobSql);
        
    }

    @Override
    public void deleteJob(int studentId) {
        String query = "delete from jobs where jobId="+studentId;
        DbUtil.insertion(query);
    }

    @Override
    public void updateJob(JobClass add) {
       String query = "update jobs set jobposition="+add.getJobPosition()+", "
               + "jobtitle="+add.getJobtitle()+", jobCategory="+add.getJobCategory()+", "
               + "jobCountry="+add.getJobCountry()+" , jobDescription ="+add.getJobDescription()+","
               + "jobDescription ="+add.getJobDescription()+","
               + "jobSalary ="+add.getJobSalary()+",jobFeatures="+add.getJobFeatures()+","
                + "jobStatus ="+add.getJobStatus()+",jobFlag="+add.getJobFlag()+" "
               + "where jobId="+add.getJobId();
       DbUtil.insertion(query);
    }

    @Override
    public List<JobClass> getAllStudents() {
        ResultSet rs = DbUtil.readData("select * from jobs where jobFlag = 0");
        ArrayList listarrJobs = new ArrayList();
        try{
        while(rs.next()){
         //Retrieve by column name
                String jobPosition = rs.getString("jobposition");
                String jobtitle = rs.getString("jobtitle");
                String jobDescription = rs.getString("jobDescription");
                String jobCountry = rs.getString("jobCountry");
                String jobCategory = rs.getString("jobCategory");
                String jobSalary = rs.getString("jobSalary");
                String jobFeatures = rs.getString("jobFeatures");
                String jobStatus = rs.getString("jobStatus");
                String jobFlag    = rs.getString("jobFlag");
                int jobId	 = rs.getInt("jobId");

                if(jobFlag.equalsIgnoreCase("0")){
                        JobClass tempJJob = new JobClass();
                        tempJJob.setJobStatus(jobStatus);
                        tempJJob.setJobSalary(jobSalary);
                        tempJJob.setJobPosition(jobPosition);
                        tempJJob.setJobFlag(jobFlag);
                        tempJJob.setJobFeatures(jobFeatures);
                        tempJJob.setJobDescription(jobDescription);
                        tempJJob.setJobCountry(jobCountry);
                        tempJJob.setJobCategory(jobCategory);
                        tempJJob.setJobtitle(jobtitle);  
                        tempJJob.setJobId(jobId);
                        listarrJobs.add(tempJJob);
                }
        }
        }catch(Exception e){e.printStackTrace();}
        
        return listarrJobs;
    }

    @Override
    public JobClass getJobById(int studentId) {
        
        ResultSet rs = DbUtil.readData("select * from jobs where jobId ="+studentId);
       
        JobClass tempJJob = new JobClass();
        try{
        while(rs.next()){
         //Retrieve by column name
                String jobPosition = rs.getString("jobposition");
                String jobtitle = rs.getString("jobtitle");
                String jobDescription = rs.getString("jobDescription");
                String jobCountry = rs.getString("jobCountry");
                String jobCategory = rs.getString("jobCategory");
                String jobSalary = rs.getString("jobSalary");
                String jobFeatures = rs.getString("jobFeatures");
                String jobStatus = rs.getString("jobStatus");
                String jobFlag    = rs.getString("jobFlag");
                int jobId	 = rs.getInt("jobId");

                if(jobFlag.equalsIgnoreCase("0")){
                        
                        tempJJob.setJobStatus(jobStatus);
                        tempJJob.setJobSalary(jobSalary);
                        tempJJob.setJobPosition(jobPosition);
                        tempJJob.setJobFlag(jobFlag);
                        tempJJob.setJobFeatures(jobFeatures);
                        tempJJob.setJobDescription(jobDescription);
                        tempJJob.setJobCountry(jobCountry);
                        tempJJob.setJobCategory(jobCategory);
                        tempJJob.setJobtitle(jobtitle);  
                        tempJJob.setJobId(jobId);
   
                }
        }
        }catch(Exception e){e.printStackTrace();}
        return tempJJob;
    }
    
}
