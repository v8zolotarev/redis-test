package org.zolotarev.redistest.entity;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("User")
public class User implements Serializable {
    private int id;
    private String name;
}
