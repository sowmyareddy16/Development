package com.example.konda.retrofitwebservices;

import android.provider.ContactsContract;

import java.util.List;

/**
 * Created by konda on 3/26/2017.
 */

public class Details {
    private List<Contacts>contactsList;

    public List<Contacts> getContactsList() {
        return contactsList;
    }

    public void setContactsList(List<Contacts> contactsList) {
        this.contactsList = contactsList;
    }
}
