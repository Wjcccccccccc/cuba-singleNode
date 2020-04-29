package com.voiceai.cubarest.core;

import com.voiceai.cubarest.entity.ExtUser;

public interface UserService {
    String NAME = "cubarest_UserService";

    Object createUser(ExtUser user);
}