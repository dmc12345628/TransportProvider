package fr.lr.iut.transportprovider.models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;

/**
 *
 * The Database constants
 *
 * @author Jesús Daniel Medina Cruz
 * @since 07/12/2017
 */

public abstract class DBC {
    public static final String DATABASE_NAME = "Transports";
    public static abstract class Transport {
        public static final String
                TABLE_NAME = "transports",
                NUMBER = "number",
                CAPACITY = "capacity",
                COLOR = "color",
        CREATE_TABLE = "create table "
                + TABLE_NAME
                + " (" + NUMBER + " text primary key, "
                + CAPACITY + " number not null, "
                + COLOR + " text not null);",
        DROP_TABLE = "drop table if exists " + TABLE_NAME;
    }
}
