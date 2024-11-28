package com.techflix.service;

import com.techflix.model.User;
import com.techflix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Verificar se o email já está em uso
        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email já cadastrado");
        }
        return userRepository.save(user);
    }

    public User loginUser(User user) {
        // Autenticação do usuário por email e senha
        User existingUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (existingUser == null) {
            throw new RuntimeException("Email ou senha incorretos");
        }
        return existingUser;
    }
}
