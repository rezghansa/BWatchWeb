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
    
    public void addJob( Addvertisments student );
    public void deleteJob( int studentId );
    public void updateJob( Addvertisments student );
    public List<Addvertisments> getAllStudents();
    public Addvertisments getJobById( int studentId );
}
