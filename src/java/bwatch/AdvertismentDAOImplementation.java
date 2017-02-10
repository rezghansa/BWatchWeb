/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bwatch;

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
    public void addJob(Addvertisments adversimnt) {
       
        String insetJobSql = "insert into jobs() values ";
        DbUtil.insertion(insetJobSql);
        
    }

    @Override
    public void deleteJob(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateJob(Addvertisments student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Addvertisments> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Addvertisments getJobById(int studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
