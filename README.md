TransportProvider - Android - Room Architecture
===== 

Cette projet contient la declaration de la base de donées ainsi comme les
donées stocké en suivant la _Nouvelle Architecture_ suggérée par Android Developpers
appelée _Room_.

# Room

Room fournit un couche d'abstraction sur SQLite pour permettre un accès
fluide à la base de données tout en exploitant toute la puissance de SQLite

_Reference_ : https://developer.android.com/topic/libraries/architecture/room.html

# Description detaillée de l'application

Cette application serve comme fournisseur de la base de donées Transports.db
pour l'application TransportResolver.

## Base de donées

La base de donées contient un tableau qui s'appelle _transports_.

### Les attributes du tableau transports :
* number text primary key.
* capacity integer.
* color text.

La structure du tableau se trouve dans la class 
_fr.lr.iut.transportprovider.models.Transport_

### Declaration DAO (Data Access Object)
```java
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
```