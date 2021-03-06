package com.games.gamelog.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class MongoCollectionCreator implements CommandLineRunner {

    @Autowired
    UserRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();

        repo.save(new User("Gregorio", "Assassin's Creed Valhalla", "Figueroa"));
        repo.save(new User("Darrien", "League of Legends", "Lee"));
        repo.save(new User("Jackson", "Call of Duty", "Meyer"));
        repo.save(new User("Adam", "Hades", "Bender"));
        repo.save(new User("Chris", "Rocket League", "Natelli"));
    }
}
