package com.krupoderov.github.musicapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "audio")
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uploader")
    private String uploader;

    @Column(name = "size")
    private double size;

    @Column(name = "date")
    private String date;

    @Column(name = "path")
    private String path;

    @Column(name = "active")
    private boolean active;
}
