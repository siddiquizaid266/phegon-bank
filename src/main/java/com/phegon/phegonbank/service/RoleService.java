package com.phegon.phegonbank.service;

import com.phegon.phegonbank.entity.Role;
import com.phegon.phegonbank.res.Response;


import java.util.List;

public interface RoleService {

    Response<Role> createRole(Role roleRequest);

    Response<Role> updateRole(Role roleRequest);

    Response<List<Role>> getAllRoles();

    Response<?> deleteRole(Long id);

}
