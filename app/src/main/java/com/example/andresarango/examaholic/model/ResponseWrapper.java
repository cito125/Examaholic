package com.example.andresarango.examaholic.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andresarango on 1/11/17.
 */

public class ResponseWrapper {

    @SerializedName("available keys")
    List<Key> availableKeys;

    public List<Key> getAvailableKeys() {
        return availableKeys;
    }
}
