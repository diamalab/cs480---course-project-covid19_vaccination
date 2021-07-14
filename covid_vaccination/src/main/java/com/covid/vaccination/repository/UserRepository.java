package com.covid.vaccination.repository;

import com.covid.vaccination.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    String query1="select * from user";
    @Query(nativeQuery = true, value = query1)
    List<User> getAllUsersInDatabase();

    String query2="select * from user where ssn=?1";
    @Query(nativeQuery = true, value=query2)
    User getUserByIdInDatabase(int user_id);

    String query3="update user set name=?1,phone_number=?2,email=?3,county=?4,password=?5,state=?6 where ssn=?7";
    @Modifying
    @Query(nativeQuery = true,value = query3)
    void updateDatabase(String name, long phone_number, String email, String county, String password,String state, int id);


    String query4="delete from user where ssn =?1";
    @Modifying
    @Query(nativeQuery = true,value=query4)
    void deleteFromDatabase(int id);
}
