package com.tubes.dashboard_app.services.User;
import com.tubes.dashboard_app.models.User;
import java.util.List;

public interface UserService {

    // Untuk membuat user baru
    User createUser(User user);

    // Untuk mendapatkan user berdasarkan ID
    User getUserById(String id);

    // Untuk mendapatkan semua user
    List<User> getAllUsers();

    // Untuk memperbarui informasi user
    User updateUser(String id, User userDetails);

    // Untuk menghapus user
    void deleteUser(String id);

    // Untuk mencari user berdasarkan email
    User getUserByEmail(String email);
}