package fr.lr.iut.transportprovider.models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.database.Cursor;

import java.util.ArrayList;

/**
 * Created by Hp on 07/12/2017.
 */

@Dao
public interface TransportDao {
    /**
     * Inserts a transport into the table.
     *
     * @param transport A new transport.
     */
    @Insert
    long insert(Transport transport);

    /**
     * Updates a transport.
     *
     * @param transport The transport to update.
     */
    @Update
    int update(Transport transport);

    /**
     * Deletes a transport.
     *
     * @param number The transport number.
     */
    @Query("delete from " + DBC.Transport.TABLE_NAME + " where " + DBC.Transport.NUMBER + " = :number")
    int deleteByNumber(String number);

    /**
     * Deletes all transports
     */
    @Query("delete from " + DBC.Transport.TABLE_NAME)
    int deleteAll();

    /**
     * Selects all transports
     */
    @Query("select * from " + DBC.Transport.TABLE_NAME)
    Cursor selectAll();

    /**
     * Selects a transport by transport number
     */
    @Query("select * from " + DBC.Transport.TABLE_NAME + " where " + DBC.Transport.NUMBER + " = :number")
    Cursor selectByNumber(String number);
}
