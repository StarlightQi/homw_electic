package com.home.electric.dao;

import com.home.electric.model.Other;

import java.util.List;

public interface IOther {
    int addOther(Other other);
    List<Other> findAll();
    Other findOther(int id);
}
