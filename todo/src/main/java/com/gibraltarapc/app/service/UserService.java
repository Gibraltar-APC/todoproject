package com.gibraltarapc.app.service;


import com.gibraltarapc.app.model.User;
import com.gibraltarapc.app.repository.NoteRepository;
import com.gibraltarapc.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * WILL CREATE (USER + NOTES), SAVE (USER ID + USER NOTES), READ (NOTES) , UPDATES (NOTES), DELETES (NOTES)
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    NoteRepository noteRepo;


    /**
     * GETS USER DATA. IF NO USER EXISTS THEN CREATES A USER
     *
     * @return
     */
    public User getUser() {

        User user;

        List<User> users = userRepo.findAll();

        if (users == null || users.isEmpty()) {

            User createUser = new User(1, null);

            user = userRepo.save(createUser);


        } else {

            user = users.get(0);

        }
        return user;


    }

    /**
     * SAVES ALL USER DATA
     *
     * @return
     */
    public User saveAllData(User user) {

        userRepo.save(user);
        noteRepo.saveAll(user.getNotes());
        return getUser();


    }


    /**
     * DELETE NOTE BY ID AND RETURNS USER
     *
     * @param id
     * @return USER
     */
    public User deleteNote(int id) {

        noteRepo.deleteById(id);
        return getUser();

    }

}






