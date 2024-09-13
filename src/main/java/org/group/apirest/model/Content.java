package org.group.apirest.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contentId;
}
