package fr.lr.iut.transportprovider.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.content.ContentValues;
import android.support.annotation.NonNull;

/**
 * @author Daniel Medina
 * @since 07/12/2017
 */
@Entity(tableName = "transports")
public class Transport {
    // attributes
    @NonNull
    @PrimaryKey
    public String number;

    public int capacity;
    public String color;

    public Transport() {
        super();
    }

    @Ignore
    public Transport(ContentValues contentValues) {
        number = contentValues.getAsString("number");
        capacity = contentValues.getAsInteger("capacity");
        color = contentValues.getAsString("color");
    }
}
