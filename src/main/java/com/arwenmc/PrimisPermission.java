package com.arwenmc;

import org.bukkit.permissions.Permission;

public enum PrimisPermission {

    ADMIN("primis.admin"),
    MODERATOR("primis.moderator"),
    HELPER("primis.helper");

    private String node;
    PrimisPermission(String permissionNode) {
        this.node = permissionNode;
    }

    public Permission getPermission() {
        return new Permission(node);
    }
}
