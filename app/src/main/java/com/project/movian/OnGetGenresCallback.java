package com.project.movian;

import com.project.movian.model.Genre;

import java.util.List;

public interface OnGetGenresCallback {
    void onSuccess(List<Genre> genres);

    void onError();
}
