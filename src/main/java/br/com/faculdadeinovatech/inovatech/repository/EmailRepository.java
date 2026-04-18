package br.com.faculdadeinovatech.inovatech.repository;

public interface EmailRepository {
    void sendPasswordResetEmail(String to, String token);

}
