package com.example.rapha.aula10.view;

import com.example.rapha.aula10.util.Professor;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Beethoven on 03/04/2016.
 */
@DatabaseTable (tableName = "disciplina")

public class Disciplina {

    @DatabaseField (generatedId = true)
    private long _id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private int quantCreditos;
    @DatabaseField
    private Professor professor;




}
