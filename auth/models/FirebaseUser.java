package com.vac.blog.auth.models;

import com.vac.blog.models.User;
import lombok.Data;

@Data
public class FirebaseUser {
    private String uid;
    private String name;
    private String issuer;
    private String picture;
    private String email;
    private boolean emailVerified;
    private User user;

}
