package pl.sikorasoftware.service;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by robertsikora on 30.08.2016.
 */

@Service
public class TestService {

    private final UserService userService;

    @Inject
    public TestService(UserService userService){
        this.userService = userService;
    }
}
