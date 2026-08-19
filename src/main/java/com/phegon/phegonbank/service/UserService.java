package com.phegon.phegonbank.service;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.phegon.phegonbank.dtos.UpdatePasswordRequest;
import com.phegon.phegonbank.dtos.UserDTO;
import com.phegon.phegonbank.entity.User;
import com.phegon.phegonbank.res.Response;


public interface UserService {

    User getCurrentLoggedInUser();

    Response<UserDTO> getMyProfile();

    Response<Page<UserDTO>> getAllUsers(int page, int size);

    Response<?> updatePassword(UpdatePasswordRequest updatePasswordRequest);

    Response<?> uploadProfilePicture(MultipartFile file);

    Response<?> uploadProfilePictureToS3(MultipartFile file);

}