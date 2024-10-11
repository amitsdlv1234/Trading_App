package com.AK_JAVA.Trading.App.repository;

import com.AK_JAVA.Trading.App.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
