/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

/**
 *
 * @author User
 */
public class DbIntegrityException extends  RuntimeException{
    
    private static final long serialVersionUID = 1l;
    
    public DbIntegrityException(String msg){
        super(msg);
    }
    
}
