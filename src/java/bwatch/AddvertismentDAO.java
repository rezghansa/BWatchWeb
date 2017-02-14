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
public interface AddvertismentDAO {
    
    public void addJob( JobClass student );
    public void deleteJob( int studentId );
    public void updateJob( JobClass student );
    public List<JobClass> getAllStudents();
    public JobClass getJobById( int studentId );
}
