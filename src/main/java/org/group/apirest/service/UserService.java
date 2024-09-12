package org.group.apirest.service;

import org.group.apirest.model.User;
import org.group.apirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void insertUser(User user){
        userRepository.save(user);
    }

    public void updateUser(User user){
        Optional<User> selectedUser = userRepository.findById(user.getUserId());

        if (selectedUser.isEmpty()){
            userRepository.save(user);
            return;
        }

        User oldUser = selectedUser.get();

        oldUser.setName(user.getName());
        oldUser.setLastName(user.getLastName());
        oldUser.setPremiumUser(user.getPremiumUser());
        oldUser.setPassword(user.getPassword());

        userRepository.save(oldUser);
    }

    public void deleteUser(int id){
        userRepository.deleteById(id);
    }
}
