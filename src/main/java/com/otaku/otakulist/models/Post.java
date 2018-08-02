package com.otaku.otakulist.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date date;
    private User user;
    private Integer likes;
    private Integer dislikes;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POST_ID")
    @OrderBy
    private Set<Comment> comments;

}
