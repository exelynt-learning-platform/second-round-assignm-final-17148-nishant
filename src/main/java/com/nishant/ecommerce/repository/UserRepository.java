
package com.nishant.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nishant.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
