package org.emplyeeService.employeeServices.services;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
