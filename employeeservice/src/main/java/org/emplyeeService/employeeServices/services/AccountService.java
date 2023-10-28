package org.emplyeeService.employeeServices.services;


import org.emplyeeService.employeeServices.model.AppRole;
import org.emplyeeService.employeeServices.model.AppUser;

public interface AccountService {
    public AppUser saveUser(String username, String password, String confirmedPassword , String email, Long cin);
    public AppRole save(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
    public AppUser signUp(String username, String password, String confirmedPassword, String email, Long cin);
    public void forgetPassword(String username);
    void updatePassword(String username, String currentPassword, String newPassword, String confirmedPassword);


}
